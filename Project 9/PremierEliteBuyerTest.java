import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Class that will test method found in PremierEliteBuyer class.
 *
 * Project 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/5/2023
 *
 */
public class PremierEliteBuyerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Method that tests the getBonusAwardPoints() 
    * method from PremierEliteBuyer class.
    */
   @Test public void getBonusAwardPoints() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      peb1.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(1000, peb1.getBonusAwardPoints(), 0.01);
   }
   
   /**
    * Method that tests the setBonusAwardPoints()
    *  method from PremierEliteBuyer class.
    */
   @Test public void setBonusAwardPoints() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      peb1.addPurchases(34.5, 100.0, 63.50, 300.0);
      peb1.setBonusAwardPoints(1001);
      Assert.assertEquals(1001, peb1.getBonusAwardPoints(), 0.01);
   }
   
   /**
    * Method that tests the calcAwardPoints()
    *  method from PremierEliteBuyer class.
    */
   @Test public void calcAwardPoints1() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      peb1.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(8460, peb1.calcAwardPoints(), 0.01);
   }
   
   /**
    * Method that tests the calcAwardPoints()
    *  method from PremierEliteBuyer class.
    */
   @Test public void calcAwardPoints2() {
      PremierEliteBuyer peb2 = new PremierEliteBuyer("10004", "Jenkin, Jordan");
      peb2.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      Assert.assertEquals(11160, peb2.calcAwardPoints(), 0.01);
   }
   
   /**
    * Method that tests the toString()
    * method from PremierEliteBuyer class.
    */
   @Test public void toStringTest1() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      peb1.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertFalse(peb1.toString().contains("bonus points added"));
   }
   
   /**
    * Method that tests the toString()
    * method from PremierEliteBuyer class.
    */
   @Test public void toStringTest2() {
      PremierEliteBuyer peb2 = new PremierEliteBuyer("10004", "Jenkin, Jordan");
      peb2.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      Assert.assertTrue(peb2.toString().contains("bonus points added"));
   }
   
}
