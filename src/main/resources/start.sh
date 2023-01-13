#!/bin/bash
if [ -d  /home/app/apps/demo ]; then
  cd /home/app/apps/demo
fi

nohup java -Xms256m -Xmx512m -Dapp=demo org.springframework.boot.loader.JarLauncher  > demo.log 2>&1 &