pipeline {
    agent any
    environment {
        Env_Name = 'QA'
        Env_Type = 'NP'
    }
    parameters {
        choice(name: 'NAME', choices: ['Hareesh', 'Kiran', 'Ramaiah'], description: 'Select the Name for Fun purpose')
    }
    stages {
        stage('Fun') {
            steps {
                script {
                    switch (params.NAME) {
                        case 'Hareesh':
                            echo 'Hareesh is a good boy'
                            break
                        case 'Kiran':
                            echo 'Kiran is a bad boy'
                            break
                        case 'Ramaiah':
                            echo 'Ramaiah is a tall boy'
                            break
                    }
                }
            }
        }
        stage('Frustration') {
            steps {
                script {
                    switch (params.NAME) {
                        case 'Hareesh':
                            echo 'Hareesh is a good boy'
                            break
                        case 'Kiran':
                            echo 'Kiran is a bad boy'
                            break
                        case 'Ramaiah':
                            echo 'Ramaiah is a tall boy'
                            break
                    }
                }
            }
        }
        stage('Future') {
            steps {
                script {
                    switch (params.NAME) {
                        case 'Hareesh':
                            echo 'Hareesh is a good boy'
                            break
                        case 'Kiran':
                            echo 'Kiran is a bad boy'
                            break
                        case 'Ramaiah':
                            echo 'Ramaiah is a tall boy'
                            break
                    }
                }
            }
        }
    }
}
