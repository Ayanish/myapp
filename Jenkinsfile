node {
  stage("Git check out") {
    git 'clean'
    git 'https://github.com/SaiKrishna2681/myapp.git'
  }
  stage("build") {
    sh 'chmod 777 build-tools-images.sh'
    sh './build-tools-images.sh'
    sh 'chmod 777 build-package.sh'
    sh './build-package.sh'
    sh 'chmod 777 build-image.sh'
    sh './build-image.sh'
  }
}
