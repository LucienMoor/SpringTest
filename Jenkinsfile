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
            }
        }
        stage('test'){
            agent{ dockerfile true
            }
           steps {
		   sh 'ping'
		   sh 'chmod +x ./runTest.sh'
		   sh './runTest.sh'
		   cleanWs()
				
            }
            
        }
    }
}
