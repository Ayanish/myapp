#!/usr/bin/env groovy

def call(String tools String project) {
  echo "Project Name : ${tools}"
  sh "docker build \
  --build-arg maven_version=3.8.4 \
  --build-arg java_version=11 \
  -t ${tools} \
  -f tools.Dockerfile \
  . "

  sh "docker build nginx -t ${project} "
}
