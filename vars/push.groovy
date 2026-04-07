def call(String imageName, String tag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'jenkins', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]){
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}" 
  sh "docker push ${dockerHubUser}/${imageName}:${tag}"
  }
}
