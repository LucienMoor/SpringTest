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
<<<<<<< HEAD
				cleanWs()
                sh 'mv ./SpringTestDemo/* ./'
                sh 'mvn -DskipTests clean package' 
                sh 'java -jar ./target/SpringTestDemo-0.0.1-SNAPSHOT.jar >/dev/null 2>&1 &'
=======

                sh 'cd ./SpringTestDemo'
		    

>>>>>>> 81019eb6c53521f8015382abec50731b48880beb
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
