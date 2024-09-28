pipeline {
    agent any
    tools {
        jdk 'JDK-17'  // Specify the JDK version
        gradle 'Gradle-8.7'  // Specify the Gradle version
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/jonasebid/classProject.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
            post {
                always {
                    junit 'build/test-results/test/*.xml'  // Publish test results
                }
            }
        }
    }
    post {
        success {
            echo 'Build succeeded'
        }
        failure {
            echo 'Build failed'
        }
    }
}
