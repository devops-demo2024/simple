#!/bin/bash
cd /home/app/apps/demo
nohup java -Xms256m -Xmx512m -Dapp=demo org.springframework.boot.loader.JarLauncher  > demo.log 2>&1 &