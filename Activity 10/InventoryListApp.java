/**
 * Class that contains methods that utilze and print objects
 * created from other classes. 
 *
 * Activity 10
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/11/2023
 */
public class InventoryListApp {
   /**
    * Creates objects from the four different classes, prints them, 
    * and calculates total.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      ItemsList myItems = new ItemsList();
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }

}