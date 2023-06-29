import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Class that will test method found in PreferredBuyer class.
 *
 * Project 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/5/2023
 *
 */
public class PreferredBuyerTest {


   /** Fixture initialization (common initialization
    *  for all tests). 
    */
   @Before public void setUp() {
   }
   
   /**
    * Method that tests the calcAwardPoints() method from PreferredBuyer class.
    */
   @Test public void calcAwardPoints() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertEquals(548.0, pb.calcAwardPoints(), 0.01);
   }
   
}
