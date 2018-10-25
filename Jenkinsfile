pipeline {
    agent none
	    environment {
        katalon_opts = 'test="test"'
    }
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
                sh 'java -jar ./target/SpringTestDemo-0.0.1-SNAPSHOT.jar >/dev/null 2>&1 &'
            }
        }
        stage('test'){
            agent{
                docker{
                    image 'docker'
                    
                }
            }
           steps {
		   sh 'printenv'
		sh 'docker run --rm -v /var/jenkins_home/workspace/DemoPipeline/SpringTest:/katalon/katalon/source:ro -v /home/ubuntu/report:/katalon/katalon/report -e KATALON_OPTS="$katalon_opts" katalonstudio/katalon'
                cleanWs()
            }
            
        }
    }
}
