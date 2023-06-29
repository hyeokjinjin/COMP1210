import java.util.Scanner;
/**
 * Program that solves for the result of a specified formula after
 * reading inputs for x, y, and z.
 * 
 * Project 2
 * Hyeokjin Jin - COMP1210 - D01
 * 1/27/23
 */
public class ExpressionSolver {
 /** 
 * Creates variable for the program and reads input for formula.
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
   
      //Declares variables for program and prints specified formula:
      Scanner userInput = new Scanner(System.in);
      double x, y, z;
      System.out.println("result = (7.1x + 3.6) "
         + "(5.0y + 4.9) (2.5z - 5.2) / xyz");
   
   
      //Prompt user for input for x, y, and z:
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
    
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      
      //Utilizes If-Else statement to discern an undefined and defined result
      if ((x * y * z) == 0) {
         System.out.println("result is undefined");
      }
      else {
         System.out.println("result = " + (((7.1 * x + 3.6) 
            * (5.0 * y + 4.9) * (2.5 * z - 5.2)) / (x * y * z)));
      }
   
   }

}