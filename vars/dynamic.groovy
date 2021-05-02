def call() {
    pipeline {
        agent any

        stages {
            stage('Deploy') {
                steps {
                    echo "Olá"
                }
            }
        }
    }

}
