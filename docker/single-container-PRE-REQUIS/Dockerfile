FROM ubuntu:14.04
MAINTAINER Matthieu Faure <mfaure@asqatasun.org>

# ##########################################################
#
#                      DISCLAIMER
#
# This is a fat container, that is absolutly not compliant to Docker best-practices
# https://docs.docker.com/engine/userguide/eng-image/dockerfile_best-practices/
# Don't use it for production as all data are wiped out at reboot / rebuild
# BUT for quick testing, that does the job :)
#
# ##########################################################

USER root
ENV  ASQA_RELEASE="4.1.0-SNAPSHOT"

WORKDIR /root

# ##########################################################
#
# Asqatasun installation
# cf http://doc.asqatasun.org/en/10_Install_doc/
#
# ##########################################################

# Add Asqatasun
# Install Asqatasun
RUN apt-get update && \
    apt-get -y --no-install-recommends install \
                                       wget \
                                       ca-certificates && \
    cd /root/ && \
    wget http://binaries.asqatasun.org/asqatasun-${ASQA_RELEASE}.i386.tar.gz && \
    tar xvfz asqatasun-${ASQA_RELEASE}.i386.tar.gz && \
    mv asqatasun*/ ./asqatasun/ && \
    cp ./asqatasun/install/xvfb . && \
    ./asqatasun/install/pre-requisites.sh && \
    rm -rvf  /root/asqatasun*

CMD service mysql start && \
    sleep 5 && \
    service xvfb start && \
    service tomcat7 start ; \
    tail -f /var/log/tomcat7/catalina.out \
