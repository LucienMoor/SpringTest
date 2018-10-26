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
				image 'lucienmoor/katalon-for-jenkins:latest'
			}
            	}
           steps {
		   
		sh 'chmod +x ./runTest.sh'
		sh './runTest.sh'
		cleanWs()
				
            }
            
        }
    }
}
