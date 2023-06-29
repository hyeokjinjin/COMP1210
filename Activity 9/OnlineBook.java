/**
 *
 * Class that contains methods that changes a text's author's name
 * and calculates cost.
 *
 * Activity 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/3/2023
 *
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   /**
    * Utilzes the parent class InventoryItem to in order to set 
    * parameters equal to respective variable.
    * @param nameIn Inputted string name for item.
    * @param priceIn Inputted price for item.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
    * Method that returns a string containing the title of 
    * text, author of text, and price of text.
    * @return String containing title, author, and price of text.
    */
   public String toString() {
      return (name  + " - " + author + ": $" + price);
   }
   
   /**
    * Method that changes the author's name of a text.
    * @param authorIn Inputted string value that the author of text is
    * changed to
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   
   
}