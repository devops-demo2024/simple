#!/bin/bash
container_id=`docker ps|grep docker-demo|awk '{print $1}'`
if [[ "$pid" == "" ]]; then
   exit 0
fi
docker container stop $container_id
