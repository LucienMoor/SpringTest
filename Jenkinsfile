pipeline {
    agent none
    stages {
        stage('Build') { 
             agent {
                docker {
                    image 'maven:3-alpine' 
                    args '-v /root/.m2:/root/.m2' 
                    }
            }
            steps {
                sh 'java -version' 
                sh 'mvn -f ./SpringTestDemo/pom.xml -DskipTests clean package' 
            }
        }
        stage('test'){
               agent {
                docker {
                    image 'mysql/mysql-server' 
                    args '-v /root/.m2:/root/.m2' 
                    }
            }
           steps {
                sh 'mvn -version' 
            }
            
        }
    }
}
