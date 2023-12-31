import java.util.Scanner;
import java.util.ArrayList;

/**
 * Demonstrates the NumberOperations class.
 *
 * Activity 5
 * Hyeokjin Jin - COMP 1210 - D01
 * 2/14/23
 */
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
   	
      Scanner in = new Scanner(System.in);
      
      // declare and instantiate ArrayList with generic type <NumberOperations>
      ArrayList<NumberOperations> numOpsList 
            = new ArrayList<NumberOperations>();
      
      // prompt user for set of numbers
      System.out.println("Enter a list of positive integers separated "
                        + "with a space followed by 0:");
         
      // get first user input using in.nextInt()
      // add a while loop as described below:   
      int userInt = in.nextInt();
      // while the input is not equal to 0 
      while (userInt != 0) {
         // add a new NumberOperations object to numOpsList based on user input
         numOpsList.add(new NumberOperations(userInt));
         // get the next user input using in.nextInt()
         userInt = in.nextInt();
      }
      
      int index = 0;
      while (index < numOpsList.size()) {
         NumberOperations num = numOpsList.get(index);
         System.out.println("For: " + num);
         // add print statement for odds under num
         System.out.println("\t" + "Odds under:" + "\t" 
            + numOpsList.get(index).oddsUnder());
         // add print statement for powers of 2 under num
         System.out.println("\t" + "Powers of 2 under:" 
            + "\t" + numOpsList.get(index).powersTwoUnder());
         index++;
      }
   }
}