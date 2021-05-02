def call() {
    pipeline {
        agent any

        stages {
            stage('Deploy') {

                steps {
                    sh gcloud app deploy
                }
            }
        }
    }

}
