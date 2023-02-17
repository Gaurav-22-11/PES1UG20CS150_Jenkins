pipeline{
    agent{
        docker{
            image 'node:14'
        }
    }
    stages{
        stage('Clone repository'){
            steps{
                git branch:'main',
                url:'https://github.com/Gaurav-22-11/PES1UG20CS150_Jenkins.git'
            }
        }
        stage('Install dependencies'){
            steps{
                sh 'npm install'
            }
        }
        stage('Build application'){
            steps{
                sh 'npm run build'
            }
        }
        stage('Test application')
        {
            steps{
                sh 'npm test'
            }
        }
    }
    post{
        failure{
            echo 'Pipeline failed'
        }
    }
}