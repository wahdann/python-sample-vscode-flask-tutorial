pipeline{
    agent{
        label "java"
    }
    stages{
        stage("build Docker image"){
            steps{
                sh "docker build -t python:v1 ."
            }
        }
    }
}