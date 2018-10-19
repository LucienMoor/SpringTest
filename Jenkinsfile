pipeline {
	{ dockerfile true }
    stages {
        stage('Build') { 
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
