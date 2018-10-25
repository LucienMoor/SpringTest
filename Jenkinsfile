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
		sh 'docker run --rm -v /var/jenkins_home/workspace/DemoPipeline/SpringTest:/katalon/katalon/source:ro -v /home/ubuntu/report:/katalon/katalon/report -e KATALON_OPTS="-browserType="Chrome" -retry=0 -statusDelay=15 -projectPath="katalon/katalon/source/SpringTest/SpringTest.prj" -testSuitePath="Test Suites/SpringTest" --config -proxy.option=MANUAL_CONFIG -proxy.server.type=HTTP -proxy.server.address=192.168.1.221 -proxy.server.port=8888" katalonstudio/katalon'
                cleanWs()
            }
            
        }
    }
}
