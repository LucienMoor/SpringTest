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
            agent{ dockerfile true
            }
           steps {
		sh 'chmod +x ./runTest.sh'
		sh 'bash Xvfb -ac :99 -screen 0 1280x1024x16 &'
                sh 'bash export DISPLAY=:99'
		sh 'bash ./runTest.sh'
		cleanWs()
				
            }
            
        }
    }
}
