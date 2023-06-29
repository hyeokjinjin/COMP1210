/**
 *
 * Class that contains methods that contains and changes
 * a customer's name, location, and balance.
 *
 * Activity 7B
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 3/20/2023
 *
 */
public class Customer implements Comparable<Customer> {
   
   
   private String name;
   private String location;
   private double balance;
   
   /**
    * Takes the inputted nameIn parameter and sets it equal to 
    * the respective instance variable, sets location to an empty
    * string, and balance to zero.
    *
    * @param nameIn Inputted customer's name.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
    * Sets location to the inputted paramater locationIn.
    * @param locationIn Inputted customer's location.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * Changes customer's balance by adding the inputted amount.
    * @param amount Inputted double that the balance is changed by.
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
      
    /**
     * Method that returns the customer's location.
     * @return location.
     */
   public String getLocation() {
      return location;
   }
      
    /**
     * Method that returns the customer's balance.
     * @return balance.
     */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Method that overloads the previous setLocation method in case
    * user inputs city and state strings seperately.
    * @param city Inputted customer's city.
    * @param state Inputted customer's state.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
    * Method that outputs a string with customer's information.
    * @return output.
    */
   public String toString() {
      String output = name + "\n";
      output += location + "\n" + "$" + balance;
      return output;
   }
   
   /**
    * Method that compares the balances from two different Customer objects.
    * @param obj Customer object that is compared to this Customer object.
    * @return 0, -1, 1 depending on the comparison of balances.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}