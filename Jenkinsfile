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
		sh 'sleep 20'
            }
        }
        stage('test'){
            agent{ docker{}
            }
           steps {
                sh 'bash ./SpringTest/run_chrome.sh'
            }
            
        }
    }
}
