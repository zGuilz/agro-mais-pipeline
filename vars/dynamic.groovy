def call() {
    node {
        git url: repositor

        stage ("Deploy Google Cloud") {
            sh gcloud app deploy
        }
    }
}
