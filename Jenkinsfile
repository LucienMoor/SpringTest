pipeline {
    agent none
    stages {
        stage('Build') { 
            agent {
              docker {
               image 'maven:3-alpine'
		args '-p 8888:8080'
              }
            }
            steps {
		
                sh 'mv ./SpringTestDemo/* ./'

            }
        }
        stage('test'){
		agent{ 
			docker{
				image 'lucienmoor/katalon-for-jenkins'
			}
            	}
           steps {
		   
		            bash '''#!/bin/bash
                 echo "hello world" 
         '''
		sh 'chmod +x ./runTest.sh'
		bash 'Xvfb :99 &'
		sh 'export DISPLAY=:99'
		sh 'xhost +'
		sh './runTest.sh'
		cleanWs()
				
            }
            
        }
    }
}
