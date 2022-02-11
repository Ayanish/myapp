#!/bin/bash

set -euo pipefail

docker build \
  --build-arg maven_version=3.8.4 \
  --build-arg java_version=11 \
  -t 2681/javaapp \
  .
  
  docker login --u "2681" -p "Sai@2681" 2681
  docker push 2681//javaapp
  