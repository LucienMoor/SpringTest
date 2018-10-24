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
                sh 'java -jar ./SpringTestDemo/target/SpringTestDemo-0.0.1-SNAPSHOT.jar'
'
            }
        }
        stage('test'){
           steps {
                sh 'mvn -f ./SpringTestDemo/pom.xml clean package' 
            }
            
        }
    }
}
