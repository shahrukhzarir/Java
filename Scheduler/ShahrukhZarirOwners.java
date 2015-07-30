
public class ShahrukhZarirOwners {
  

  
  public ShahrukhZarirOwners(String name) {
  String line;
  String owner1 = null;
  String owner2 = null;
    line = name;
    for(int i = 0; i < name.length(); i++) {
      if((line.substring(i, i+1)).equals(",")) {
        owner1 = line.substring(0, i);
        owner2 = line.substring(i+2);
      }
          }
    System.out.println(owner1);
      System.out.println(owner2);
  }
}