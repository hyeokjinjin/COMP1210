/**
 * Class containing user defined exception 
 * thrown and caught in the readBuyerFile 
 * method in the BuyerProcessor class.
 *
 * Project 11
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/27/2023
 */
public class InvalidCategoryException extends Exception {
   /**
    * Constructor method for this class with takes string parameter
    * and invokes super constructor.
    * @param categoryIn Inputted string that represented the invalid category.
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + "\"" + categoryIn + "\"");
   }

}