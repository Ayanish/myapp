#!/usr/bin/env groovy

def call(String tools) {
  echo "Project Name : ${tools}"
  sh "docker build \
  --buid-arg maven_version=3.8.4 \
  --build-arg java_version=11 \
  -t ${tools} \
  -f tools.Dockerfile \
  . "
}
