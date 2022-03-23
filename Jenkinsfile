@Library('pipeline-library-demo')_

pipeline{
   agent any     
     triggers {
        githubPush()
      }
    stages {
        stage('Welcome Step') {
            steps { 
                echo 'Welcome to LambdaTest'
                echo 'Welcome 8790'
				echo 'Hello, world'
                sayHello 'myapp, app'
            }
        }
    }
 }