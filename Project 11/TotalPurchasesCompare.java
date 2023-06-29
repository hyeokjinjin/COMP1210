import java.util.Comparator;
/**
 * Class containing method to sort the buyer objects by an 
 * order based on the amount of total purchases.
 *
 * Project 11
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/27/2023
 */
public class TotalPurchasesCompare implements Comparator<Buyer> {
  /**
   * Method that compares two buyer objects and returns an int
   * based of if one buyer is equal, greater than, or less than the
   * other buyer object.
   * @return -1, 1, 0 based on the outcome of the comparison.
   * @param b1 First parameter buyer object that is compared.
   * @param b2 Second parameter buyer object that is compared.
   */
   public int compare(Buyer b1, Buyer b2) {
      if (b1.calcTotal() > b2.calcTotal()) {
         return -1;
      }
      if (b1.calcTotal() < b2.calcTotal()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}