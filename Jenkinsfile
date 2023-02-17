pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'g++ -o PES1UG20CS150 PES1UG20CS150-1.cpp'
                echo 'BUILD SUCCESSFUL'
            }
        }

        stage('Test') {
            steps {
                sh './PES1UG20CS150'
            }
        }

        stage('Deploy') {
            steps {
                echo 'DEPLOYMENT SUCCESSFUL'
            }
        }
    }

    post {
        always {
            script {
                if (currentBuild.result == 'FAILURE') {
                    echo 'pipeline failed'
                }
            }
        }
    }
}
