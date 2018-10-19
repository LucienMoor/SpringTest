pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            agent { docker 'mysql/mysql-server' }
            steps {
                sh 'java -version' 
                sh 'mvn -f ./SpringTestDemo/pom.xml -DskipTests clean package' 
            }
        }
        stage('test'){
           steps {
                sh 'java -version' 
                sh 'mvn -f ./SpringTestDemo/pom.xml clean package' 
            }
            
        }
    }
}
