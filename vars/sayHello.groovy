#!/usr/bin/env groovy

def call(String project) {
  echo "Project Name : ${project}"
  sh "docker build --buid-arg maven_version=3.8.4 --build-arg java_version=11 -t ${project} ."
}
