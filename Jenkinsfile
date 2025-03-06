pipeline {
    agent any
     environment {
            // Define Docker Hub credentials ID
            DOCKERHUB_CREDENTIALS_ID = 'Docker_Hub'
            // Define Docker Hub repository name
            DOCKERHUB_REPO = 'viettrung21/week7-inclass-travelcostcal'
            // Define Docker image tag
            DOCKER_IMAGE_TAG = 'latest_v1'
        }
    stages {
        stage('Checkout') {
            steps {
               git branch:'master', url: 'https://github.com/viettrung2103/w6-inclass-travelcostcal-docker-jenkin.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage("Test & Coverage"){
            steps{
                bat 'mvn test jacoco:report'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    jacoco execPattern: '**/target/jacoco.exec',
                            classPattern: '**/target/classes',
                            sourcePattern: '**/src/main/java',
                            exclusionPattern: '**/test/**'

                }
            }
        }


        stage('Deploy') {
            steps {
                echo 'Deploy stage completed'
            }
        }
    }
}