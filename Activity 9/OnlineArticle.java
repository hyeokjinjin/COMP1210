/**
 *
 * Class that contains methods that keep track of word count of
 * a text alongside OnlineTextItem and InventoryItem. 
 *
 * Activity 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/3/2023
 *
 */
public class OnlineArticle extends OnlineTextItem {

   private int wordCount;
   
   /**
    * Utilzes the parent class InventoryItem to in order to set 
    * parameters equal to respective variable.
    * @param nameIn Inputted string name for item.
    * @param priceIn Inputted price for item.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
    * Method that sets the inputted wordcount to the respective variable.
    * @param wordCountIn Inputted word count.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }

}