def call(String imageName, String tag){
  echo "code building start"
  sh "docker build -t ${imageName}:${tag} ."
  echo "allhamdulliah"
}
