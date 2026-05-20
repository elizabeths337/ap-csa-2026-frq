public String getShortenedName() {
  String short = "";
  if (username.substring(0,1).equals("-" || username.substring(substring.length() - 1).equals("-") || username.length() >= 2)) {
    return username;
  }
  int consec = 0;
  for (int i = 0; i < username.length(); i++ {
    // add check if consec
      
  }
  
  for (int i = 0; i < username.length(); i++) {
    if (username.indexOf("-") != -1) {
      short += username.substring(i,i+1);
    }
  return short;
}
