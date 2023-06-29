/**
 * Class that contains methods calculating the cost
 * of an inventory item with shipping cost added.
 *
 * Activity 10
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/11/2023
 */
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   
  /**
   * Static variable of type double representing the fixed shipping cost rate. 
   */ 
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * Utilzes the parent class InventoryItem to in order to set 
    * parameters equal to respective variable.
    * @param nameIn Inputted string name for item.
    * @param priceIn Inputted price for item.
    * @param weightIn Inputted weight for item.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
    * Method that calculates the total cost with tax and
    * shipping rate based off weight.
    * @return double that represent the total cost. 
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}