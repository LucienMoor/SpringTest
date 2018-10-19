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
                sh 'mvn -f ./SpringTestDemo/pom.xml -DskipTests clean install' 
                sh 'mvn -e -X -f ./SpringTestDemo/pom.xml -Dtest=SpringTestDemoApplicationTests test'
            }
        }
    }
}
