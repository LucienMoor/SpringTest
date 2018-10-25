pipeline {
    agent none
	    environment {
        katalon_opts = '/katalon/katalon/project/SpringTest.prj'
    }
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
		sh 'ls'
		sh './SpringTest/run_chrome.sh'
                cleanWs()
            }
            
        }
    }
}
