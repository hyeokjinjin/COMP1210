import java.util.ArrayList;

/**
 * Class that holds an a list of temperatures
 * and return different temperatures based on method.
 *
 * Activity 6
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 2/20/23
 */
public class Temperatures {
   private ArrayList<Integer> temperatures;
   
   /**
    * Sets array list temperatures equal to the array list from parameter.
    * @param temperaturesIn user's inputted array list
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   /**
    * Method that finds the lowest temperature from array list.
    * @return low Lowest temperature from array list.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
    * Method that finds the highest temperature from array list.
    * @return high Highest temperature from array list.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
   /**
    * Method that determines if integer parameter is lower than
    * lowest temperature from the array list.
    * @param lowIn User's inputted low temperature.
    * @return lowIn < getLowTemp() ? lowIn : getLowTemp()
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
    * Method that determines if integer parameter is higher than
    * highest temperature from the array list.
    * @param highIn User's inputted high temperature.
    * @return highIn > getHighTemp() ? highIn : getHighTemp()
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
    * Returns a created string displaying the temperature list,
    * the lowest temperature, and the highest temperature.
    * @return a long string
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}