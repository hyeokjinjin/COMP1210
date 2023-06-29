import java.text.DecimalFormat;
/**
 * Child class of Buyer.java containing methods that 
 * utilizes methods from Buyer.java, calculates award points,
 * and calculates discount applied to total.
 *
 * Project 11
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/27/2023
 */
public class EliteBuyer extends Buyer {
   protected double discountRate = 0.05;
   /**
    * Takes two parameter inputs and sets it equal to respective
    * instance variables using the Buyer class constructor and
    * sets the category to the correct category.
    *
    * @param acctNumberIn Inputted account number of user.
    * @param nameIn Inputted name of user.
    */
   public EliteBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Elite Buyer";
   }
   
   /**
    * Method that returns the discount rate.
    * @return discount rate.
    */
   public double getDiscountRate() {
      return discountRate;
   }
   
   /**
    * Method that sets the discount rate to the inputted rate.
    * @param discountRateIn Inputted discount rate.
    */
   public void setDiscountRate(double discountRateIn) {
      discountRate = discountRateIn;
   }
   
   /**
    * Method that calculates ten award point for one dollar of the subtotal.
    * @return ten award points given to user for each dollar of the subtotal.
    */
   public int calcAwardPoints() {
      return ((int) calcSubtotal() * 10);
   }
   
   /**
    * Calculates subtotoal with the discount rate applied.
    * @return subtotal with discount rate applied.
    */
   public double calcSubtotal() {
      double total = 0;
      for (double purchase : purchases) {
         total += purchase;
      }
      return (total * (1 - discountRate));
   }
   
   /**
    * Method that overrides the toString method found in Buyer class
    * which adds information on whether the discount rate is applied 
    * alongside with the rest of the user's information.
    * @return string output.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat fd = new DecimalFormat("#,##0");
      String output = "";
      output += category + "\n";
      output += "AcctNo/Name: " + acctNumber + " " + name + "\n";
      output += "Subtotal: " + df.format(calcSubtotal()) + "\n";
      output += "Tax: " + df.format(SALES_TAX_RATE * calcSubtotal()) + "\n";
      output += "Total: " + df.format(calcTotal()) + "\n";
      output += "Award Points: " + calcAwardPoints() + "\n";
      output += "(includes " + discountRate 
         + " discount rate applied to Subtotal)\n";
      return output;
   }
   
}