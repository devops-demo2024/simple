#!/bin/bash
pid=`ps -ef|grep java|grep demo|awk '{print $2}'`
if [[ "$pid" == "" ]]; then
   exit 0
fi
kill -9 $pid
