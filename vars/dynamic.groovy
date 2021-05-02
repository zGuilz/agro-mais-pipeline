def call() {
    pipeline {
        agent any

        stages {
            stage('Deploy') {
                steps {
                    step{
                        gcloud app deploy
                    }

                }
            }
        }
    }

}
