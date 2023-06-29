import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Program that calculate an input in a specific formula
 * and then displays the result, the number of digits before
 * and after the decimal point, and the result rounded.
 *
 * Project 3
 * Hyeokjin Jin - COMP 1210 - D01
 * 2/2/2023
 */
public class MathFormula {
   /**
    * Creates variables and utilizes the variables for the
    * formula's math.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      
      // Declares input variable and parts of the equation for ease:
      Scanner userInput = new Scanner(System.in);
      double x;
      double numerator, denominator1, denominator2, result;
      String resultStr = "";
      int left, right;
      
      // Utilizes user input as "X" for the formula:
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      numerator = Math.pow(x, 9) + 10;
      denominator1 = Math.abs((5 * Math.pow(x, 3)) - (3 * Math.pow(x, 2)));
      denominator2 = Math.sqrt((4 * Math.pow(x, 6)) - (2 * Math.pow(x, 2)) + 1);
      result = numerator / (denominator1 + denominator2);
      resultStr = Double.toString(result);
      System.out.println("Result: " + resultStr);
      
      // Calculate the number of digits before and after the decimal point:
      left = resultStr.indexOf(".");
      right = resultStr.length() - (resultStr.indexOf(".") + 1);
      System.out.println("# digits to left of decimal point: " + left);
      System.out.println("# digits to right of decimal point: " + right);
      
      // Formats the new round result:
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      System.out.println("Formatted Result: " + df.format(result));
   
   }

}