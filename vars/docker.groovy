#!/usr/bin/env groovy

def call(String tools, String app, String uName) {
  echo "Project Name : ${tools}"
  

  
  sh "docker build -t ${app} ."
  sh "docker tag ${app}:latest ${uName}/${app}:latest"
  sh "docker push ${uName}/${app}:latest"
}
