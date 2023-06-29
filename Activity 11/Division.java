/**
 * Class that contains methods takes two inputs
 * and divides it, returning an int and double.
 *
 * Activity 11
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/18/2023
 *
 */
public class Division {
   /**
    * Takes two ints and returns the quotient. Also catches if denom is zero.
    * @return quotient or 0 if denom is zero.
    * @param numIn Inputted numerator int.
    * @param denomIn Inputted denominator int.
    */
   public static int intDivide(int numIn, int denomIn) {
      try
      {
         return (numIn / denomIn);
      }
      catch (ArithmeticException e)
      {
         return 0;
      }
   }
   
   /**
    * Takes two ints, widens to double, and returns the quotient. 
    * Also catches if denom is zero.
    * @return quotient of the two inputted numbers.
    * @param numIn Inputted numerator int.
    * @param denomIn Inputted denominator int.
    */
   public static double decimalDivide(int numIn, int denomIn) {
      double num = numIn;
      double denom = denomIn;
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return (num / denom);
   }
   

}