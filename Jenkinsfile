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
		   sh 'ls'
		   sh './runTest.sh'
			cleanWs()
				
            }
            
        }
    }
}
