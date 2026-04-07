def call(String imageName, String tag, String dockerHubUser){
  withCredentials([usernamepassword(credentialsId: 'jenkins', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')])
  sh "docker login -u ${dockerHUbUser} -p ${dockerHubPass}" 
  sh "docker push ${dockerHubUser}/${imageName}/${tag}"
}
