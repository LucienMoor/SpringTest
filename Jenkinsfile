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
				sh 'ls'
                sh 'katalon -noSplash  -runMode=console -consoleLog -projectPath="./SpringTest/SpringTest.prj" -retry=0 -testSuitePath="Test Suites/SpringTest" -executionProfile="default" -browserType="Chrome"'
                cleanWs()
            }
            
        }
    }
}
