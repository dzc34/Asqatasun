
How to install a plugin in Jenkins manually?
http://stackoverflow.com/questions/14950408/how-to-install-a-plugin-in-jenkins-manually


 docker build --tag local/asqatasun_jenkins .
 
    # rajouté dans le dockerfile :  /!\ 
    chmod 777 /opt/asqa_runner     

sudo docker run --name asqa_jenkins_3 -d -p 127.0.0.1:8087:8080 -p 127.0.0.1:8989:8089 test_asqa_jenkins3
docker exec -ti asqa_jenkins_3 /bin/bash

docker run --name asqa_jenkins -d -p 127.0.0.1:8081:8080 -p 127.0.0.1:8089:8089 local/asqatasun_jenkins

docker exec -ti test_toto asqa_jenkins
cd /opt/asqa_runner
bin/asqatasun.sh -d 99 -f /opt/firefox/firefox -l "A" -r "Rgaa30" -o ./ -x 256 -t "Page" http://www.mecatrouve.com
bin/asqatasun.sh -d 99 -f /opt/firefox/firefox  -r "Rgaa30"  http://www.mecatrouve.com  
		
Path to the Asqatasun Runner installation
-------------------------------------------				
/opt/asqa_runner

    @@@TODO fix name "/opt/asqatasun_runner"


Display port	
-------------------------------------------				
99

Firefox binary path	
-------------------------------------------		
/opt/firefox/firefox	

Asqatasun webapp URL	
-------------------------------------------				
http://localhost:8081/asqatasun

Database hostname	
-------------------------------------------				
localhost	

Database port	
-------------------------------------------				
3306	

Database name	
-------------------------------------------				
asqatasun	

Database login	
-------------------------------------------			
asqatasun	

Database password	
-------------------------------------------		
asqaP4sswd

Asqatasun account login
-------------------------------------------	
me@my-email.org



-----------------------------------------------------------------------
 	* Path to the Asqatasun Runner installation				
	example : /opt/asqatasun	

 	* Display port				
	example : 99. This value MUST NOT start with a ':'	

 	* Firefox binary path			
	example : /opt/firefox/firefox	

 	* Asqatasun webapp URL				
	example : http://localhost:8080/asqatasun

 	* Database hostname				
	example : localhost	

 	* Database port				
	example : 3306	

 	* Database name				
	example : asqatasun	

 	* Database login			
	example : asqatasun	

 	* Database password		
myAsqaPassword
 	* Asqatasun account login
        me@my-email.org
