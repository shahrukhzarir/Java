import java.util.Scanner;
import java.lang.Math;


public class Nim {
  
  private static int stones = 0; //contains total stones throughout 
  private static boolean isPlayer = true; // switches turns within player and computer 
  
  /* validates whether the input entered by computer or user is valid */
  public static boolean isValidEntry(int selectedStones ) {
    boolean isValid = true;    
    if (stones >= selectedStones && selectedStones <= stones) {
      if ( selectedStones < 1 || selectedStones > 3 ) 
        isValid = false;
    }
    else
      isValid = false;
    
    return isValid;
  }
  /* decides how many stones computer will take */
  public static int drawStones() {
    int computerEntry; //contains stones entered by computer
    computerEntry =(int)((3)* Math.random() + 1); //generates random code from 1 to 3 
    return computerEntry;
  }
  
  public static void processUser() 
  {
    boolean success = false; //whether the input is valid through isValid method 
    int selectedStones = 0; //stones entered by user 
    while ( !success )
    {
      /* will ask until valid amount is enter*/
      System.out.print("There are " + stones + " stones. How many would you like?");
      Scanner input = new Scanner(System.in);
      selectedStones = input.nextInt(); 
      success = isValidEntry(selectedStones); 
    }
    if ( success )
      stones = stones - selectedStones; //subtracts stones entered 
    isPlayer = false; //switches over to computer 
  }
  
  public static void processComputer() 
  {
    
    boolean success = false; // whether the input is valid through isValid method
    int computerEntry = 0; //contains stones entered by computer 
    while( !success ){
      computerEntry = drawStones();
      success = isValidEntry(computerEntry);
    }
    if ( success )
    {
      System.out.println("There are " + stones + " stones. The computer takes " + computerEntry + " stones.");
      stones = stones - computerEntry;// subtracts computers entry to the total amount of stones 
    }
    isPlayer = true; // converts to true so it switches to user 
  }
  
  private static boolean checkResult()
  {
    boolean isContinue = true;
    if ( stones <= 0 ) //condition to end the games 
    {
      if ( isPlayer )
        System.out.println("The player beats the computer."); //displays player as winner 
      else {
        System.out.println("The computer beats the player."); //displays computer as winner 
      }
      isContinue = false;
    }
    return isContinue;
  }
  
  public static void main(String [] args){ 
    stones =(int)((16)* Math.random() + 15); //generates initial stone count   
   /* loops turn over again from player to computer until stones is equal to 0 */
    while (stones !=0) {
      if (isPlayer) {
        checkResult();
          processUser();
      }else{
        checkResult();
          processComputer();
        }
    }
    checkResult();
  }
}