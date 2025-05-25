pipeline{
    agent{
        label "newAgent"
    }
    stages{
        stage("Build Docker image"){
            steps{
                sh "echo 'Building the image' "
                sh "docker build -t wahdann/cicdlab2:v${BUILD_NUMBER} ."
            }
        }
        stage("Push Docker image to Dockerhub"){
            steps{
                sh "docker push wahdann/cicdlab2:v${BUILD_NUMBER}"
            }
        }
    }
}