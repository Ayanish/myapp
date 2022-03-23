#!/usr/bin/env groovy

def call(String project) {
  echo "Project Name : ${project}"
  sh "docker build . -t ${project} "
}
