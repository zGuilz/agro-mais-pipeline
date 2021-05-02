def call() {
    pipeline {
        agent any

        stages {
            stage('Deploy') {

                steps {
                    gcloud app deploy
                }
            }
        }
    }

}
