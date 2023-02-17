pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh 'g++ -o PES1UG20CS150-1 working.cpp'
            }
        }
        
        stage('Test') {
            steps {
                sh './PES1UG20CS150-1'
            }
        }
        
        stage('Deploy') {
            steps {
                // Add deploy steps here
                echo 'Deployed'
            }
        }
    }
    
    post {
        always {
            echo 'Pipeline finished'
        }
        
        failure {
            echo 'Pipeline failed'
        }
    }
}
