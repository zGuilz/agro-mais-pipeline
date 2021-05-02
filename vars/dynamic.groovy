import br.com.core.PipeSteps

def call(String repositor) {
    node {


        stage ("Deploy Google Cloud") {
            sh gcloud app deploy
        }
    }
}
