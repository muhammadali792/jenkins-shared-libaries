def call(String imageName, String tag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'jenkins', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]){
  sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}" 
  sh "docker push ${dockerHubUser}/${imageName}:${tag}"
  }
}
