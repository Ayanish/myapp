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
                sayHello 'myapp', 'myjavaapp', '2681'
            }
        }
    }
 }