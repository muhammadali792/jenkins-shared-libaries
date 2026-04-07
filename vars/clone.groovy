def call(string url, string branch){
  echo "code cloning start"
  git url: url, branch: branch
  echo "code cloning done"
}
