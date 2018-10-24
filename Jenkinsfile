pipeline {
    agent {
      docker {
       image 'maven:3-alpine' 
      }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mv ./SpringTestDemo/* ./'
                sh 'mvn -DskipTests clean package' 
            }
        }
        stage('test'){
           steps {
                sh 'mvn clean package' 
                cleanWs()
            }
            
        }
    }
}
