import java.text.DecimalFormat;
/**
 *
 * Child class of EliteBuyer class containing methods that utilizes
 * methods from Buyer.java, calculates award points, calculates discount
 * applied to total, and adds additional award points based on subtotal amount.
 *
 * Project 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/5/2023
 *
 */
public class PremierEliteBuyer extends EliteBuyer {
   private int bonusAwardPoints = 1000;
   
   /**
    * Takes two parameter inputs and sets it equal to respective
    * instance variables using the Buyer class constructor, sets the 
    * category to the correct category, and sets the discount rate to 15%.
    *
    * @param acctNumberIn Inputted account number of user.
    * @param nameIn Inputted name of user.
    */
   public PremierEliteBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Premier Elite Buyer";
      setDiscountRate(0.15);
   }
   
   /**
    * Method that returns the bonus award points.
    * @return bonusAwardPoints.
    */
   public int getBonusAwardPoints() {
      return bonusAwardPoints;
   }
   
   /**
    * Method that sets the bonus award points to the inputted integer.
    * @param bonusAwardPointsIn Integer the bonus award points will be set to.
    */
   public void setBonusAwardPoints(int bonusAwardPointsIn) {
      bonusAwardPoints = bonusAwardPointsIn;
   }
   
   /**
    * Method that calculates 20 award point for one dollar of the subtotal and
    * adds the bonus award points if subtotal is greater than 500.
    * @return total amount of points for user.
    */
   public int calcAwardPoints() {
      int points = 0;
      if (calcSubtotal() > 500) {
         points = ((int) calcSubtotal() * 20);
         points += bonusAwardPoints;
      }
      else {
         points = ((int) calcSubtotal() * 20);
      }
      return points;
   }
   
   /**
    * Method that overrides the toString method found in Buyer class
    * which adds information on whether the discount rate is applied 
    * and/or bonus award points are added alongside with the rest
    * of the user's information.
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
      if (calcSubtotal() > 500) {
         output += "(includes " + bonusAwardPoints 
            + " bonus points added to Award Points)\n";
      }
      return output;
   }
   
}