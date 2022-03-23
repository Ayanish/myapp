#!/usr/bin/env groovy

def call(String app) {
  echo "Project Name : ${app}"
  sh "docker build \
  --build-arg maven_version=3.8.4 \
  --build-arg java_version=11 \
  -t ${app} \
  -f tools.Dockerfile \
  . "

  sh "docker pull nginx -t ${app} "
  sh "docker build ${app}"
}
