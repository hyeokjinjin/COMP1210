import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Class that will test method found in EliteBuyer class.
 *
 * Project 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/5/2023
 *
 */
public class EliteBuyerTest {


   /** Fixture initialization (common initialization
    *  for all tests). 
    */
   @Before public void setUp() {
   }
   
   /**
    * Method that tests the getDiscountRate() method from EliteBuyer class.
    */
   @Test public void getDiscountRate() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(0.05, eb.getDiscountRate(), 0.01);
   }
   
   /**
    * Method that tests the setDiscountRate() method from EliteBuyer class.
    */
   @Test public void setDiscountRate() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.addPurchases(34.5, 100.0, 63.50, 300.0);
      eb.setDiscountRate(0.1);
      Assert.assertEquals(0.1, eb.getDiscountRate(), 0.01);
   }
   
   /**
    * Method that tests the calcAwardPoints() method from EliteBuyer class.
    */
   @Test public void calcAwardPoints() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(4730, eb.calcAwardPoints(), 0.01);
   }
   
   /**
    * Method that tests the calcSubtotal() method from EliteBuyer class.
    */
   @Test public void calcSubtotal() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(473.10, eb.calcSubtotal(), 0.01);
   }
   
   /**
    * Method that tests the toString() methods from EliteBuyer class.
    */
   @Test public void toStringTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertTrue(eb.toString().contains("discount rate applied"));
   }


}
