#!/bin/bash

Xvfb :99 &
export local_addr="172.17.0.4"

/Katalon_Studio_Linux_64-5.7.1/katalon -noSplash  -runMode=console -projectPath="/var/jenkins_home/workspace/DemoPipeline/SpringTest/SpringTest.prj" -retry=1 -testSuitePath="Test Suites/SpringTest" -executionProfile="default" -browserType="Chrome (headless)" -Djava.awt.headless
