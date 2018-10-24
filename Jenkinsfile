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
                sh 'mv ./SpringTestDemo/* ./'
                sh 'mvn -DskipTests clean package' 
                sh 'javaw -jar ./target/SpringTestDemo-0.0.1-SNAPSHOT.jar'
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
                cleanWs()
            }
            
        }
    }
}
