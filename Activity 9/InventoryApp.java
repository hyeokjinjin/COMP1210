/**
 *
 * Class that contains methods that utilze and print objects
 * created from other classes. 
 *
 * Activity 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/3/2023
 *
 */
public class InventoryApp {

   /**
    * Creates objects from the four different classes and prints them.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.5);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      System.out.println(item4);
   }


}