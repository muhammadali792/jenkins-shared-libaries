def call(String url, String branch){
  echo "code cloning start"
  git url: "${url}", branch: "${branch}"
  echo "code cloning done"
}
