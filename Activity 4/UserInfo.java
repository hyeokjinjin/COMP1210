/**
 *
 * Class that contains multiple methods that 
 * accept parameters which will each return a value.
 *
 * Activity 4
 * Hyeokjin Jin - COMP 1210 - D01
 * 2/7/2023
 *
 */
public class UserInfo {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private Integer age;
   private Integer status;
   private static final int OFFLINE = 0, ONLINE = 1;

   // constructor
   /**
    * Takes two inputted parameters representing the first and last name of user
    * and sets the rest of the user info to default values.
    * @param firstNameIn Inputted string of user's first name
    * @param lastNameIn Inputted string of user's last name
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   /**
    * Creates the final string message with each variable that will be outputed.
    * @return output
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
    
    
   /**
    * Takes inputted paramater and sets it as user's location.
    * @param locationIn Inputted string of user's updated location
    */
   public void setLocation(String locationIn) {
      location = locationIn; 
   }
   
   /**
    * Takes inputted parameter to use an If statemnt to set user's updated age.
    * @param ageIn Inputted int of user's updated age
    * @return isSet
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * Returns age for method getAge.
    * @return age
    */
   public int getAge() {
      return age;
   }
   
   /**
    * Returns location for method getLocation.
    * @return location
    */
   public String getLocation() {
      return location;
   }
   
   /**
    * Changes the status to "OFFLINE".
    * @void
    */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
    * Changes the status to "ONLINE".
    * @void
    */
   public void logOn() {
      status = ONLINE;
   }
   
}