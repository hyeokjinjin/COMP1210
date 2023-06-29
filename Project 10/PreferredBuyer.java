/**
 * Child class of Buyer.java containing methods that 
 * utilizes methods from Buyer.java and calculates award points.
 *
 * Project 10
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/20/2023
 */
public class PreferredBuyer extends Buyer {
   
   /**
    * Takes two parameter inputs and sets it equal to respective
    * instance variables using the Buyer class constructor and
    * sets the category to the correct category.
    *
    * @param acctNumberIn Inputted account number of user.
    * @param nameIn Inputted name of user.
    */
   public PreferredBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Preferred Buyer";
   }
   
   /**
    * Method that calculates one award point for one dollar of the subtotal.
    * @return award points given to user for each dollar of the subtotal.
    */
   public int calcAwardPoints() {
      return (int) calcSubtotal();
   }

}