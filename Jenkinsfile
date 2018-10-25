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

                sh 'cd ./SpringTestDemo'
		    

            }
        }
        stage('test'){
            agent{ dockerfile true
            }
           steps {
		   sh 'mv ./ksp/* ./'
		   sh 'ls /var/jenkins_home/workspace/DemoPipeline'
		  		sh 'apk update'
		   		sh 'apk upgrade'
		   		sh 'apk add bash'
				sh 'chmod +x ./run_chrome.sh'
		   		cleanWs()
				
            }
            
        }
    }
}
