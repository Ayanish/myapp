@Library('pipeline-library-demo')_

pipeline{
   agent any     
     triggers {
        githubPush()
      }
    stages {
        stage('Welcome Step') {
            steps { 
				echo 'Hello, world'
                sayHello 'myapp', 'busybox2', '2681'
            }
        }
    }
 }