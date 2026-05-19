public class Account {
  private String username; 

  public Account(String requestedName) {
    String user = requestedName;
    if (isAvailable(user)) {
      username = user;
    } else {
      int num = 1;
      while (!(isAvailable(user))) {
        user = user + Integer.toString(num);
      } 
      username = user;
    }
  }
}
