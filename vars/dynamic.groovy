def call() {
    pipeline {

        agent any

        node {
            git url: repositor

            stage ("Deploy Google Cloud") {

                steps{
                    gcloud app deploy
                }

            }
        }
    }


}
