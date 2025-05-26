@Library('libx')_
pipeline{
    agent{
        label "java"    }
    environment{
        DOCKER_USER = credentials('dockerhub-user')
        DOCKER_PASS = credentials('dockerhub-password')
    }
    stages{
        stage("build Docker image"){
            steps{
               // sh "docker build -t itiv4/data-iti:v${BUILD_NUMBER} ."
                script{
                    def dockerx = new org.iti.docker()
                    dockerx.build("itiv4/data-iti", "${BUILD_NUMBER}")
                }
            }
            
        }
        stage("Push Docker image"){
            steps{
                sh "docker tag itiv4/data-iti:v${BUILD_NUMBER} aliyounis22/data-iti:v${BUILD_NUMBER}"
                sh "docker push aliyounis22/data-iti:v${BUILD_NUMBER}"
                script{
                    def dockerx = new org.iti.docker()
                    dockerx.login("${DOCKER_USER}", "${DOCKER_PASS}")
                    dockerx.push("${DOCKER_USER}","itiv4/data-iti", "${DOCKER_PASS}")
                }
            }
        }
    }
}