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
                sh 'mvn clean package' 
                sh 'java -jar ./target/SpringTestDemo-0.0.1-SNAPSHOT.jar >/dev/null 2>&1 &'
            }
        }
        stage('test'){
            agent{
                docker{
                    image 'docker'
                    
                }
            }
           steps {
				sh 'ls /usr/bin/env'
		  		sh 'ls /usr/bin'
		   		sh 'ls /bin'
		   		sh 'apt-get update'
		   		sh 'apt-get install bash'
				sh 'chmod +x ./SpringTest/run_chrome.sh'
				sh 'bash ./SpringTest/run_chrome.sh'
						cleanWs()
            }
            
        }
    }
}
