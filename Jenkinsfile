pipeline {
    agent {
      docker {
       image 'maven:3-alpine' 
      }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'java -version' 
                sh 'mvn -f ./SpringTestDemo/pom.xml -DskipTests clean package' 
                sh 'cd ./SpringTestDemo'
                sh 'mvn spring-boot:run'
            }
        }
        stage('test'){
           steps {
                sh 'mvn -f ./SpringTestDemo/pom.xml clean package' 
            }
            
        }
    }
}
