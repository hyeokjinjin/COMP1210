import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Class that will test method found in Buyer class.
 *
 * Project 9
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/5/2023
 *
 */
public class BuyerTest {


   /** Fixture initialization (common initialization
    *  for all tests). 
    */
   @Before public void setUp() {
   }
   
   /**
    * Method that tests the getAcctNumber() method from Buyer class.
    */
   @Test public void getAcctNumber() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertEquals("10001", pb.getAcctNumber());
   }
   
   /**
    * Method that tests the setAcctNumber() method from Buyer class.
    */
   @Test public void setAccountNumber() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      pb.setAcctNumber("101");
      Assert.assertEquals("101", pb.getAcctNumber());
   }
   
   /**
    * Method that tests the getName() method from Buyer class.
    */
   @Test public void getName() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertEquals("Smith, Sam", pb.getName());
   }
   
   /**
    * Method that tests the setName() method from Buyer class.
    */
   @Test public void setName() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      pb.setName("Hopkins, John");
      Assert.assertEquals("Hopkins, John", pb.getName());
   }
   
   
   /**
    * Method that tests the getPurchases() and setPurchases()
    * methods from Buyer class.
    */
   @Test public void setPurchases() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      double[] test = {1, 2};
      pb.setPurchases(test);
      Assert.assertEquals(test, pb.getPurchases());
   }
   
   /**
    * Method that tests the addPurchases() methods from Buyer class.
    */
   @Test public void addPurchases() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      double[] test = {34.5, 100.0, 63.50, 350.0};
      Assert.assertArrayEquals(test, pb.getPurchases(), 0.01);
   }
   
   /**
    * Method that tests the deletePurchases() methods from Buyer class.
    */
   @Test public void deletePurchases1() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      pb.deletePurchases(34.5, 63.50);
      double[] test = {100.0, 350.0};
      Assert.assertArrayEquals(test, pb.getPurchases(), 0.01);
   }
   
   /**
    * Method that tests the deletePurchases() methods from Buyer class.
    */
   @Test public void deletePurchases2() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.deletePurchases(34.5);
      double[] test = new double[0];
      Assert.assertArrayEquals(test, pb.getPurchases(), 0.01);
   }
   
   /**
    * Method that tests the calcSubtotal() methods from Buyer class.
    */
   @Test public void calcSubtotal() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertEquals(548.00, pb.calcSubtotal(), 0.01);
   }
   
   /**
    * Method that tests the calcTotal() methods from Buyer class.
    */
   @Test public void calcTotal() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertEquals(591.84, pb.calcTotal(), 0.01);
   }
   
   /**
    * Method that tests the toString() methods from Buyer class.
    */
   @Test public void toStringTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertTrue(pb.toString().contains("AcctNo/Name: "));
   }
   
}
