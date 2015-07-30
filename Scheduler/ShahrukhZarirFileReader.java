
import java.io.*;

public class ShahrukhZarirFileReader {
  
  
  public static void createOwners() {
    for(int i = 0; i < 5; i++){
    ShahrukhZarirSessions.displaySession();
    File ownerFile = new File("owners.txt");
    FileReader in;
    BufferedReader readFile;
    String line;
    int k = 1;
    try {
      in = new FileReader(ownerFile);
      readFile = new BufferedReader(in);
      while((line = readFile.readLine()) != null) {
        ShahrukhZarirCompanies companies = new ShahrukhZarirCompanies(line);
        createCandidates(k);
        k++;
      }
    } catch (FileNotFoundException e) {
      System.out.println("File could not be found.");
      System.err.println("FileNotFoundException: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Problem with input/output.");
      System.err.println("IOException: " + e.getMessage());
    }
    }
  }
  private static void createCandidates(int k) {
    File candidateFile = new File("candidates.txt");
    FileReader in;
    BufferedReader readFile;
    String line = null;
    try {
      in = new FileReader(candidateFile);
      readFile = new BufferedReader(in);
      for(int i = 0; i < k; i++) {
        
      line = readFile.readLine();
      }
      ShahrukhZarirCompanies.setCandidates(line);
    } catch (FileNotFoundException e) {
      System.out.println("File could not be found.");
      System.err.println("FileNotFoundException: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Problem with input/output.");
      System.err.println("IOException: " + e.getMessage());
    }
  }
}