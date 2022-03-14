@Library('docker')_

pipeline{
   agent any     
     triggers {
        githubPush()
      }
    stages {
        stage('Welcome Step') {
            steps { 
                echo 'Welcome to LambdaTest'
                echo 'Welcome 1234'
                call(app, app,  myapp, myapp)
            }
        }
    }
 }

