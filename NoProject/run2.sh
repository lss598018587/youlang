#!/bin/sh
export MAVEN_OPTS="-XX:MaxPermSize=128M -Xms512m -Xmx800m"
mvn jetty:run -Dmaven.test.skip=true -Djetty.port=10143
