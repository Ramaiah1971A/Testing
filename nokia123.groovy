pipeline{
    agent any
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
        }
}
