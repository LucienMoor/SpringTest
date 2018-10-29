pipeline {
    agent none
    stages {
        stage('Build') { 
            agent {
              docker {
               image 'maven:3-alpine'
              }
            }
            steps {
		
                sh 'mv ./SpringTestDemo/* ./'
		sh 'mvn package' 

            }
        }
        stage('test'){
		agent{ 
			docker{
				image 'lucienmoor/katalon-for-jenkins:latest'
				args '-p 8888:8080'
			}
            	}
           steps {
		sh 'java -jar ./target/SpringTestDemo-0.0.1-SNAPSHOT.jar'
		   // >/dev/null 2>&1 &
		//sh 'sleep 30'
		//sh 'chmod +x ./runTest.sh'
		//sh 'sleep 300000'
		//sh './runTest.sh'

		cleanWs()
				
            }
            
        }
    }
}
