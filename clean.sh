#!/bin/bash
source ./env.sh
for MYFILE in `find $BASE/out/ -iname "*.class"`
do 
  rm -v $MYFILE
done
