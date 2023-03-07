pipeline {
    agent { label 'Windows_123_slave' }
    environment {
        HName = 'Hareesh'
        KName = 'Kiran'
        RName = 'Ramaiah'
    }
    parameters {
        choice(name: 'NAME', choices: ['Hareesh', 'Kiran', 'Ramaiah'], description: 'Select the Name for Fun purpose')
    }
    stages {
        stage('Fun') {
            steps {
                script {
                    echo '$HName is a good boy'
                    echo '$KName is a bad boy'
                    echo '$RName is a tall boy'
                }
            }
        }
        stage('Fun2') {
            steps {
                script {
                    echo '$HName is a good boy'
                    echo '$KName is a bad boy'
                    echo '$RName is a tall boy'
                }
            }
        }
        stage('Fun3') {
            steps {
                script {
                    echo '$HName is a good boy'
                    echo '$KName is a bad boy'
                    echo '$RName is a tall boy'
                }
            }
        }
    }
}
