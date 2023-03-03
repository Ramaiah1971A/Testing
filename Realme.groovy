pipeline {
    agent any
    environment {
        Env_Name = 'QA'
        Env_Type = 'NP'
    }
    Parameter {
        choice (name: 'DC' choices: ['HAresh', 'QA', 'Sprint'], description: 'Select QA Environment for deployment')
    }
    stages {
            stage('Build') {
                steps {
                    echo ' his name is hareesh'
                }
            }
            stage('Test'){
                steps {
                    echo 'his name is kiran'
                }
            }
            stage('Deploy') {
                steps {
                    echo 'his name is harsha'
                }
            }
            stage('Demo Active Choices Parameter') {
                steps {
                    echo "States Selected ${states}"
                    echo "Cities Selected ${cities}"
                }
            }
            
        }
}
