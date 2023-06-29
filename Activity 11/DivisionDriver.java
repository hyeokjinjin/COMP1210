import javax.swing.JOptionPane;
/**
 * Class that contains main method that will
 * ask user for two inputs and return a window containing
 * either error message or integer/decimal quotient of the two inputs.
 *
 * Activity 11
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/18/2023
 *
 */
public class DivisionDriver {
   /**
    * Main method of the DivisionDriver class that asks for user's
    * input of numerator and denominator and returns a window of the 
    * integer and decimal value of quotient unless denominator is zero,
    * in which it will return a error message.
    * @param args Commandline arguments not used.
    */
   public static void main(String[] args) {
   
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");
      
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e)
      {
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }
   
   }


}