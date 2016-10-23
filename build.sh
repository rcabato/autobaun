#!/bin/bash
source ./env.sh
$BASE/clean.sh
pushd $BASE/src/
javac -d $BASE/out com/remcreate/autobahn/track/Track.java
popd

