#!/usr/bin/env groovy

def call(String tools, String app) {
  echo "Project Name : ${tools}"
  sh "docker build \
  --build-arg maven_version=3.8.4 \
  --build-arg java_version=11 \
  -t ${tools} \
  -f tools.Dockerfile \
  . "

  
  sh "docker build -t ${app} ."
  sh "docker tag ${app}:latest 2681/${app}:latest"
  sh "docker push 2681/${app}:latest"
}
