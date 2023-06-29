import java.util.ArrayList;
import java.util.Scanner;
   
/**
 * Class that askes for user's inputs of temperatures
 * and returns a string based on the inputted list.
 *
 * Activity 6
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 2/20/23
 */
public class TemperatureInfo {
  /**
   * Reads user's inputs of temperatures and add to
   * a list in order to ask the user to print the whole list,
   * the list's lowest temp, the list's highest temp, or end the program.
   * 
    * @param args - Standard commandline arguments
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - "
            + "[L]ow temp, [H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
         
      } while (choice != 'E');
   }
}