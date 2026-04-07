def call(String imageName, String tag, String portMapping){
  echo "deployment start"
  sh "docker run -d -p ${portMapping} ${imageName}:${tag}"
  echo "deployment done"
}
