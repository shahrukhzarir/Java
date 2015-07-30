import java.lang.Math; 
import java.util.Scanner; 

public class ShahrukhZarirDRPlayer { 
 
  private static int playerScore = 1000; 
  private static int diceRoll = 0; 
  private static int userGuess = 0; 
  
 /*
  * constructor
  * pre: none
  * post: ShahrukhZarirGame object created 
  */ 
  public ShahrukhZarirDRPlayer () {
    playerScore = 1000; 
    userGuess = 0; 
  diceRoll = (int)(11 * Math.random() + 2);
  }
  
  public int generateRoll() {
    diceRoll = (int)(11 * Math.random() + 2);
    return(diceRoll);
  }
  public int getUserGuess() {
    Scanner input = new Scanner(System.in);
    System.out.println("How many points do you want to risk? (-1 to quit): ");
    userGuess = input.nextInt();
    return (userGuess);
}
}
  

  
