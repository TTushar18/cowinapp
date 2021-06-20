pipeline {

    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }

    agent any

    tools {
        maven 'maven_3.8.1'
    }

    stages {
        stage('Code Compilation') {
            steps {
                echo 'Code Compilation is In Progress!'
                sh 'mvn --version'
                sh 'mvn clean compile'
            }
        }
        stage('Code QA Execution') {
            steps {
                echo 'Junit Test case check in Progress!'
                sh 'mvn --version'
                sh 'mvn clean test'
            }
        }
        stage('Code Package') {
            steps {
                echo 'Creating War Artifact'
                sh 'java -version'
                sh 'mvn clean package'
            }
        }
        stage('Building Docker Image') {
            steps {
                echo 'Starting Building Docker Image'
                sh 'java -version'
                echo 'Completed  Building Docker Image'
            }
        }
        stage(' Docker Image Tag') {
            steps {
                echo 'Starting Building Docker Image'
                sh 'java -version'
                echo 'Completed  Building Docker Image'
            }
        }
        stage(' Docker push to Docker Hub') {
            steps {
                echo 'Starting Building Docker Image'
                sh 'java -version'
                echo 'Completed  Building Docker Image'
            }
        }
        stage(' Docker Image Push to Amazon ECR') {
            steps {
                echo 'Starting Building Docker Image'
                sh 'java -version'
                echo 'Completed  Building Docker Image'
            }
        }

        stage(' Deployment to K8s Cluster') {
            steps {
                echo 'Starting Building Docker Image'
                sh 'java -version'
                echo 'Completed  Building Docker Image'
            }
        }
    }
}
