/**
 * Class that contains methods which calculates
 * the total cost of an item with a changable tax rate.
 *
 * Activity 10
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/11/2023
 */
public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * Takes in two parameters and sets it equal to respective variable.
    * @param nameIn Inputted string name for item.
    * @param priceIn Inputted price for item.
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * Method that returns the name of item.
    * @return name String name.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Method that calulates the total cost of item.
    * @return calculated cost with tax rate.
    */
   public double calculateCost() {
      return (price * (1 + taxRate));
   }
   
   /**
    * Method that sets the tax rate to the inputted parameter.
    * @param taxRateIn Double that the tax rate is set to.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * Returns a string that has the name of item and price.
    * @return string containing total cost.
    */
   public String toString() {
      return (name + ": $" + calculateCost());
   }
   
}