/**
 * Class that contains methods that utilze and print objects
 * created from other classes. 
 *
 * Activity 10
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/11/2023
 */
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * Sets the array inventory equal to an array with 20 slots
    * and sets the count variable equal to zero.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
    * Method that adds inputted InventoryItem to array inventory.
    * @param itemIn Inputted InventoryItem object.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    * Calculates the total amount of inventory items but adds electronics 
    * surcharge if the item is an instance of electronic item class.
    * @param electronicsSurcharge Inputted electronics surcharge rate.
    * @return total.
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
    * Returns a string containing all the inventory items.
    * @return string containing inventory items.
    */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   }

}