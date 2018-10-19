pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'java -version' 
                sh 'mvn -f ./SpringTestDemo/pom.xml -DskipTests clean package' 
            }
        }
        stage('test'){
            agent {
            docker {
                image 'mysql/mysql-server'
                args '--name some-mysql -e MYSQL_ROOT_PASSWORD=demo1234 MYSQL_DATABASE=spring_test -d'}
            }
           steps {
                sh 'java -version' 
                sh 'mvn -f ./SpringTestDemo/pom.xml clean package' 
            }
            
        }
    }
}
