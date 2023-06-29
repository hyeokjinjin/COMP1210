/**
 *
 * Class that contains methods find odds, evens, and average
 * of an array list containing intergers.
 *
 * Activity 8
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 3/27/2023
 *
 */
public class Scores {

   private int[] numbers;
   
   /**
    * Sets the parameter array list to the instance variable
    * with type array list.
    * @param numbersIn Arraylist of type interger.
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
    * Finds the evens of an array list.
    * @return evens An arraylist of the even numbers.
    */
   public int[] findEvens() {
      int numberEvens = 0;
     
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
     
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
    * Finds the odds of an array list.
    * @return odds An arraylist of the odds numbers.
    */
   public int[] findOdds() {
      int numberOdds = 0;
     
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
     
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
    * Finds the average of an array list.
    * @return average of an array list.
    */
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return (sum / numbers.length);
   }
   
   /**
    * Returns a string containing integers from array list in order.
    * @return result A string with integers from array list in order.
    */
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   /**
    * Returns a string containing integers from array list in reverse order.
    * @return result A string with integers from array list in reverse order.
    */
   public String toStringInReverse() {
      String result = "";
    
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers [i] + "\t";
      }
      
      return result;
   }
   
}