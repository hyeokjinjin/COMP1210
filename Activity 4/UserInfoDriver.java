/**
 *
 * Class that creates two instances of UserInfo and invokes
 * the containted methods from UserInfo.java on these instances.
 *
 * Activity 4
 * Hyeokjin Jin - COMP 1210 - D01
 * 2/7/2023
 *
 */
public class UserInfoDriver {
   /**
    *
    * Sets up two different instances of UserInfo, each
    * assigned to user1 and user2 variables respectively.
    *
    * @param args Command line arguments - not used.
    *
    */
   public static void main(String[] args) {
   
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}