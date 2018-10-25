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
                sh 'mvn -DskipTests clean package' 
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
		   sh 'mv ./SpringTest/* ./'
		  		sh 'apk update'
		   		sh 'apk upgrade'
		   		sh 'apk add bash'
				sh 'chmod +x ./run_chrome.sh'
				sh 'bash ./run_chrome.sh'
						cleanWs()
            }
            
        }
    }
}
