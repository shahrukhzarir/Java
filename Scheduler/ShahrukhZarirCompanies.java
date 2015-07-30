
import java.util.ArrayList;

public class ShahrukhZarirCompanies {
  
  private String company;
  private static ArrayList<String> candidates = new ArrayList<String>();
  private static ArrayList<String> owners = new ArrayList<String>();
  
  public ShahrukhZarirCompanies(String line) {
    owners = new ArrayList<String>();
    int begins = 0;
    for(int i = 0; i < line.length(); i++) {
      if((line.substring(i, i+1)).equals(",") && begins == 0) {
        company = line.substring(begins, i);
        
        begins = i+2;
      } else if((line.substring(i, i+1)).equals(",")) {
        owners.add(line.substring(begins, i));
        begins = i+2;
      } else if(i == line.length() - 1) {
        owners.add(line.substring(begins, i+1));
      }
    }
  }
  public static void setCandidates(String line) {
    candidates = new ArrayList<String>();
    int begins = 0;
    for(int i = 0; i < line.length(); i++) {
      if((line.substring(i, i+1)).equals(",") && begins == 0) {
        
        
        begins = i+2;
      } else if((line.substring(i, i+1)).equals(",")) {
        candidates.add(line.substring(begins, i));
        begins = i+2;
      } else if(i == line.length() - 1) {
        candidates.add(line.substring(begins, i+1));
      }
    }
    
    
     ShahrukhZarirSessions session = new ShahrukhZarirSessions(owners, candidates);
  }
}