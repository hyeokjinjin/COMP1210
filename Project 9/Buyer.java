import java.util.Arrays;
import java.text.DecimalFormat;
/**
 *
 * Abstract class containing methods that will calculate
 * subtotal and total of user's purchases given a list of purchases.
 *
 * Project 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/5/2023
 *
 */
public abstract class Buyer {
   protected String category, acctNumber, name;
   protected double[] purchases;
  /**
   * Instance field declaring the sales tax rate to be 0.08.
   */
   public static final double SALES_TAX_RATE = 0.08;
   
   /**
    * Takes two parameter inputs and sets it equal to respective
    * instance variables.
    *
    * @param acctNumberIn Inputted account number of user.
    * @param nameIn Inputted name of user.
    */
   public Buyer(String acctNumberIn, String nameIn) {
      acctNumber = acctNumberIn;
      name = nameIn;
      purchases = new double[0];
   }
   
   /**
    * Method that returns the account number of user.
    * @return acctNumber.
    */
   public String getAcctNumber() {
      return acctNumber;
   }
   
   /**
    * Method that sets account number to inputted number.
    * @param acctNumberIn Inputted account number of user.
    */
   public void setAcctNumber(String acctNumberIn) {
      acctNumber = acctNumberIn;
   }
   
   /**
    * Method that returns the name of user.
    * @return name.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Method that sets account name to inputted name.
    * @param nameIn Inputted name of user.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * Method that returns the list of purchases of user.
    * @return purchases.
    */
   public double[] getPurchases() {
      return purchases;
   }
   
   /**
    * Method that sets the array of purchases to inputted array.
    * @param purchasesIn Inputted array of purchases. 
    */
   public void setPurchases(double[] purchasesIn) {
      purchases = purchasesIn;
   }
   
   /**
    * Method that adds additional purchases to the array purchases.
    * @param purchasesIn Variable length of purchases that 
    * will be added to the array purchases.
    */
   public void addPurchases(double... purchasesIn) {
      int index = purchases.length;
      purchases = Arrays.copyOf(purchases, purchases.length 
         + purchasesIn.length);
      for (int i = 0; i < (purchasesIn.length); i++) {
         purchases[i + index] = purchasesIn[i];
      }
   }
   
   /**
    * Method that deleted inputted purchases from array purchases.
    * @param purchasesIn Variable length of purchases that 
    * will be deleted from array purchases.
    */
   public void deletePurchases(double... purchasesIn) {
      for (double purch : purchasesIn) {
         for (int i = 0; i < (purchases.length); i++) { 
            if (purchases[i] == purch) {
               for (int j = i; j < (purchases.length - 1); j++) {
                  purchases[j] = purchases[j + 1];
               }
               purchases = Arrays.copyOf(purchases, purchases.length - 1);
               break;
            }
         }
      }
   }
   
   /**
    * Method that calculates subtotal of purchase list.
    * @return total Total subtotal amount.
    */
   public double calcSubtotal() {
      double total = 0;
      for (double purchase : purchases) {
         total += purchase;
      }
      return total;
   }
   
   /**
    * Method that calculates the total of purchase list
    * including tax rate added.
    * @return Total amount with tax added as well.
    */
   public double calcTotal() {
      double total = calcSubtotal();
      return (total * (1 + SALES_TAX_RATE));
   }
   
   /**
    * Method that creates and returns a string output with
    * the user's information.
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
      return output;
   }
   
   /**
    * Abstract method that will calculate the award points
    * rewarded to user based on their subtotal.
    * @return award points based on user's subtotal.
    */
   public abstract int calcAwardPoints();

}