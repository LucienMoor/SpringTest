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
                sh 'rm -r ./SpringTestDemo'
                sh 'mv ./SpringTestDemo/* ./'
                sh 'mvn -DskipTests clean package' 
                sh 'java -jar ./target/SpringTestDemo-0.0.1-SNAPSHOT.jar $'
            }
        }
        stage('test'){
            agent{
                docker{
                    image 'katalonstudio/katalon:latest'
                }
            }
           steps {
                sh 'ls' 
            }
            
        }
    }
}
