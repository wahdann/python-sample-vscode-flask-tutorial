pipeline{
    agent{
        label "java"
    }
    environment{
        XYZ='ITI ITI ITI'
    }
    stages{
        stage("build Docker image"){
            steps{
                sh "echo '${XYZ}'"
                sh "docker build -t python:v${BUILD_NUMBER} ."
            }
        }
    }
}