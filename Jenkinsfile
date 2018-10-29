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
		sh 'mvn clean package' 
		sh 'java -jar ./target/SpringTestDemo-0.0.1-SNAPSHOT.jar >/dev/null 2>&1 &'
		stash name: "app", includes: "./target/*"
		sh 'ls'


            }
        }
        stage('test'){
		agent{ 
			docker{
				image 'lucienmoor/katalon-for-jenkins:latest'
			}
            	}
           steps {
		unstash "app"
		sh 'ls'
		   sh 'java -jar ./target/SpringTestDemo-0.0.1-SNAPSHOT.jar >/dev/null 2>&1 &'
		   sleep 30000
		//sh 'sleep 30'
		//sh 'chmod +x ./runTest.sh'
		//sh 'sleep 300000'
		//sh './runTest.sh'

		cleanWs()
				
            }
            
        }
    }
}
