node('newAgent') {
    stage('Build Docker image') {
        sh "echo 'Building the image'"
        sh "docker build -t wahdann/cicdlab2:v${env.BUILD_NUMBER} ."
    }
    stage('Push Docker image to Dockerhub') {
        sh "docker push wahdann/cicdlab2:v${env.BUILD_NUMBER}"
    }
}
