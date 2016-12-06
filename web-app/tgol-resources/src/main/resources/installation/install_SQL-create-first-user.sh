#!/bin/bash

set -o errexit

#############################################
# Init
#############################################

declare prefix="/"

declare database_user=
declare database_passwd=
declare database_db=
declare database_host=
declare asqa_admin_email=
declare asqa_admin_passwd=

declare omit_cleanup=true
declare quiet=false

declare dirty_database=false

declare PKG_DIR=$(pwd)

declare -a OPTIONS=(
	database_user
	database_passwd
	database_db
	database_host
        asqa_admin_email
        asqa_admin_passwd

)

warn() {
	if [[ ! $quiet ]]; then
            echo "WARNING : $*"
        fi
}

error() {
	echo "ERROR : $*"
	return 1
}


fail_with_usage() {
        echo ""
	echo "FAILURE : $*"
        echo ""
        usage
	if [[ ! $omit_cleanup ]]; then
            cleanup
        fi
	exit -1
}

fail() {
        echo ""
	echo "FAILURE : $*"
        echo ""
	if [[ ! $omit_cleanup ]]; then
            cleanup
        fi
	exit -1
}

prerequisites() {

	echo ""
	echo "Please verify your configuration meets the requirements : http://doc.asqatasun.org/en/10_Install_doc/Asqatasun/Pre-requisites.html"
	echo ""	
	read -p "Are you sure you want to continue installation (yes/no)? " response
	if [[ ! "${response}" == "yes" ]]; then
            fail "Installation is stopped"
        fi
	echo ""	
}



#############################################
# Usage
#############################################

usage() {
	cat << EOF

Usage : $0 [-h] 
        --database-user <Asqatasun database user> 
        --database-passwd <Asqatasun database password> 
        --database-db <Asqatasun database db> 
        --database-host <database host> 
        --asqa-admin-email <Asqatasun admin email>
        --asqa-admin-passwd <Asqatasun admin password>

	
Installation options :
 --database-user             Database user for Asqatasun
 --database-passwd           Database password for Asqatasun
 --database-db               Database name for Asqatasun
 --database-host             Database hostname (FQDN or local hostname)
 --asqa-admin-email          Email for the Asqatasun admin user
 --asqa-admin-passwd         Pawword for the Asqatasun admin user


Script options :
 -h --help           Display this help message

EOF
}

#############################################
# Option management
#############################################
proceed_cmdline() {
    while [[ "$#" -gt 0 ]]; do
        local var=$(echo ${1#--} | tr '-' '_')
        local isVar=false

        for option in ${OPTIONS[@]}; do
            if [[ "$option" = "$var" ]]; then
                eval $var=$2
                shift 2 || fail_with_usage "Missing argument after $1"
                isVar=true
                break
            fi
        done
        if [[ ! $isVar ]]; then
            case "$1" in
                -h|--help)        usage; exit 0;;
                *) usage; exit 1;;
            esac
        fi
    done
        
}

getvar() {
    echo $1 | sed 's/^-\+//' | tr '-' '_'
}

echo_missing_options() {
    for option in ${OPTIONS[@]}; do
            [[ -z "$(eval echo \${$option})" ]] && \
                    echo -n "--${option/-/_} "
    done
}

proceed_stdin() {
    local missing_options=$(echo_missing_options)
    [[ ! -z $missing_options ]] && fail_with_usage "Missing options : " $missing_options
    for option in ${OPTIONS[@]}; do
        local value=$(eval echo \${$option})
        while [[ -z "$value" ]]; do
            ${quiet} || echo -n "$option : "
            read $option
            value=$(eval echo \${$option})
            echo $value
        done
    done
}











#############################################
# User & contract creation
#############################################
create_first_user() {
    # create admin user for Asqatasun
    cd "$PKG_DIR/web-app/sql-management"
    sed -i -e "s/^DbUser=.*$/DbUser=$database_user/g" \
        -e "s/^DbUserPasswd=.*$/DbUserPasswd=$database_passwd/g" \
        -e "s/^DbName=.*$/DbName=$database_db/g"  \
        -e "s/^DbHost=.*$/DbHost=$database_host/g" \
        tg-set-user-admin.sh tg-create-user.sh  || \
            fail "Unable to create Asqatasun admin user"
    sh ./tg-create-user.sh -e "${asqa_admin_email}" -p "${asqa_admin_passwd}" -l " " -f " " >/dev/null || \
        fail "Error while creating Asqatasun admin user. User may already exists"
    sh ./tg-set-user-admin.sh -u $asqa_admin_email >/dev/null || \
        fail "Error while setting Asqatasun user as admin"
}

create_first_contracts() {
    # create 3 typical contracts
    cd "$PKG_DIR/web-app/sql-management"

    # add SQL procedure "contract_create"
    ./PROCEDURE_contract_create.sh \
        --database-user "$database_user" \
        --database-passwd "$database_passwd" \
        --database-db "$database_db" \
        --database-host "$database_host" || \
            fail "Unable to add SQL Procedure 'contract_create'"

    # Contract Wikipedia A11Y
    ./ASQA_contract_create_A11Y_RGAA3.sh \
        -c "Wikipedia A11Y RGAA-3" \
        -u 1 \
        -w "http://en.wikipedia.org/" \
        --database-user "$database_user" \
        --database-passwd "$database_passwd" \
        --database-db "$database_db" \
        --database-host "$database_host" \
        --audit-page \
        --audit-site \
        --audit-file \
        --audit-scenario \
        --audit-manual \
        -m 1000 || \
            fail "Unable to create contract: Wikipedia A11Y RGAA-3"
    # Contract Wikipedia SEO
    ./ASQA_contract_create_SEO.sh \
        -c "Wikipedia SEO" \
        -u 1 \
        -w "http://en.wikipedia.org/" \
        --database-user "$database_user" \
        --database-passwd "$database_passwd" \
        --database-db "$database_db" \
        --database-host "$database_host" \
        -m 1000 || \
            fail "Unable to create contract: Wikipedia SEO"
    # Contract A11Y Openbar
    ./ASQA_contract_create_A11Y_RGAA3_openbar.sh \
        -c "openbar A11Y RGAA3.0" \
        -u 1 \
        --database-user "$database_user" \
        --database-passwd "$database_passwd" \
        --database-db "$database_db" \
        --database-host "$database_host"  || \
            fail "Unable to create contract: Openbar A11Y RGAA-3.0"
    # Contract A11Y Openbar RGAA32016
    ./ASQA_contract_create_A11Y_RGAA32016_openbar.sh \
        -c "openbar A11Y RGAA3.2016" \
        -u 1 \
        --database-user "$database_user" \
        --database-passwd "$database_passwd" \
        --database-db "$database_db" \
        --database-host "$database_host"  || \
            fail "Unable to create contract: Openbar A11Y RGAA-3.2016"
}

#############################################
# Finish
#############################################
echo_installation_summary() {
	cat << EOF

Well done !


EOF
}

#############################################
# main
#############################################
main() {
echo "------- fdffffffffffffffffffff -----------------"
echo "------- fdffffffffffffffffffff -----------------"
    # get options
    proceed_cmdline "${@:2}"
    proceed_stdin

    # prerequisites
    prerequisites

    # create first user
    create_first_user
    echo "Asqatasun admin creation:             OK"
    create_first_contracts
    echo "Asqatasun contract creation:          OK"

    # done
    echo_installation_summary
}

main "$0" "$@"
exit $?
