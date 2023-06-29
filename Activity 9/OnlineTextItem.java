/**
 *
 * An abstract class representing an online text item that users can buy. 
 *
 * Activity 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/3/2023
 *
 */
public abstract class OnlineTextItem extends InventoryItem {
   
   /**
    * Utilzes the parent class InventoryItem to in order to set 
    * parameters equal to respective variable.
    * @param nameIn Inputted string name for item.
    * @param priceIn Inputted price for item.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

   /**
    * Method that calculated the price without the tax.
    * @return price, variable inherited from parent class.
    */
   public double calculateCost() {
      return price;
   }
   
}