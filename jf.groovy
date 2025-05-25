node('newAgent') {
    stage('Checkout Code') {
        git url: 'https://github.com/wahdann/python-sample-vscode-flask-tutorial.git', branch: 'main'
    }
    stage('Build Docker image') {
        sh "echo 'Building the image'"
        sh "docker build -t wahdann/cicdlab2:v${env.BUILD_NUMBER} ."
    }
    stage('Push Docker image to Dockerhub') {
        sh "docker push wahdann/cicdlab2:v${env.BUILD_NUMBER}"
    }
}
