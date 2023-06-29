/**
 * Class that holds an integer value and will perform multiple
 * operations on that value.
 *
 * Activity 5
 * Hyeokjin Jin - COMP 1210 - D01
 * 2/14/23
 */
public class NumberOperations {
   private int number;
   
    /**
     * Takes an user inputted number and sets it to the instance variable.
     *
     * @param numberIn Inputted integer of number
     */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   
    /**
     * Returns the variable number whenever method is called.
     * @return number
     */
   public int getValue() {
      return number;
   }

    /**
     * Creates a string concatentated with odd values under the variable number.
     * @return output
     */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
    
    /**
     * Creates a string concatentated with powers of two 
     * under the variable number.
     * @return output
     */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
    /**
     * Compares the variable number with an inputted integer parameter.
     * @return 1, -1, 0 Returns 1, -1, 0 depending on the comparison outcome
     * @param compareNumber Inputted integer that is compared
     */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
    /**
     * Returns a string containing the variable number conatentated with "".
     * @return number + ""
     */
   public String toString() {
      return number + "";
   }
}