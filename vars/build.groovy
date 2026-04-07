def call(String imageName, String tag){
  echo "code buildig start"
  sh "docker build -t ${imageName}: ${tag} ."
  echo "allhamdulliah"
}
