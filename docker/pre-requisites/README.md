


```
# Docker UI
sudo docker pull portainer/portainer
sudo docker run --name dockerUI--restart always -d -p 127.0.0.1:9000:9000 -v /var/run/docker.sock:/var/run/docker.sock portainer/portainer

sudo docker pull asqatasun/asqatasun:base_wget
sudo docker pull asqatasun/asqatasun:only-DB
sudo docker pull asqatasun/asqatasun:pre-requisites_without-DB
sudo docker pull asqatasun/asqatasun:pre-requisites_with-empty-DB
sudo docker pull asqatasun/asqatasun:SNAPSHOT_v2
sudo docker pull asqatasun/asqatasun:SNAPSHOT

docker pull asqatasun/asqatasun:v4.0.1
docker pull asqatasun/asqatasun:v4.0.2
docker pull asqatasun/asqatasun:v4.0.3

docker run --name asqatasun_v4.0.3 --restart always -d -p 127.0.0.1:8080:8080 asqatasun/asqatasun:v4.0.3

-----------------------------------------------
294 MB      SNAPSHOT
            |-- Ubuntu:14.04
-----------------------------------------------
297 MB      SNAPSHOT_v2
216 MB      |-- pre-requisites_with-empty-DB
187 MB          |-- pre-requisites_without-DB
 98 MB              |-- only-DB
 68 MB                  |-- base_wget
                            |-- Ubuntu:14.04
-----------------------------------------------

-----------------------------------------------
294 MB      asqatasun/asqatasun:SNAPSHOT
            |-- Ubuntu:14.04
-----------------------------------------------
297 MB      asqatasun/asqatasun:SNAPSHOT_v2
216 MB      |-- asqatasun/asqatasun:pre-requisites_with-empty-DB
187 MB          |-- asqatasun/asqatasun:pre-requisites_without-DB
 98 MB              |-- asqatasun/asqatasun:only-DB
 68 MB                  |-- asqatasun/asqatasun:base_wget
                            |-- Ubuntu:14.04
-----------------------------------------------

```

            


