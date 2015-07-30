
import java.util.ArrayList;

public class ShahrukhZarirSessions {
  
  private static int session = 1;
  
  public ShahrukhZarirSessions(ArrayList<String> owners, ArrayList<String> candidates) {
    
    String owner;
    String candidate;
    for(int i = 0; i < owners.size(); i++) {
      owner = owners.get(i);
      int num = (int)((candidates.size())*Math.random());
      candidate = candidates.get(num);
      System.out.println(owner + "  |  " + candidate);
      candidates.remove(num);
    }
  }
  
  public static void displaySession() {
    System.out.println("Session: " + session);
    session++;
  }
}