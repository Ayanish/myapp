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
                docker 'myapp', 'mysampleapploication', '2681'
            }
        }
    }
 }