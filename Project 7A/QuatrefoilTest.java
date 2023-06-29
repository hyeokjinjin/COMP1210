import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * Class that contains methods that tests methods from
 * the Quatrefoil.java class.
 *
 * Project 7A
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 3/17/2023
 *
 */
public class QuatrefoilTest {


   /**
    * Fixture initialization (common initialization for all tests). 
    */
   @Before public void setUp() {
   }
   
   /**
    * Tests the getLabel method from the Quatrefoil class.
    */
   @Test public void getLabelTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals("Small Example", test1.getLabel());
   }
   
   /**
    * Tests the setLabel method from the Quatrefoil class by
    * expecting true to be returned.
    */
   @Test public void setLabelTestT() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(test1.setLabel("New Small Example"));
   }
   
   /**
    * Tests the setLabel method from the Quatrefoil class by
    * expecting false to be returned.
    */
   @Test public void setLabelTestF() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertFalse(test1.setLabel(null));
   }       
    
    /**
    * Tests the get method from the Quatrefoil class.
    */
   @Test public void getDiameterTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(3.5, test1.getDiameter(), 0.00001);
   }
   
   /**
    * Tests the setDiameter method from the Quatrefoil class by
    * expecting true to be returned.
    */
   @Test public void setDiameterTestT() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(test1.setDiameter(7.0));
   }
   
   /**
    * Tests the setDiameter method from the Quatrefoil class by
    * expecting false to be returned.
    */
   @Test public void setDiameterTestF() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertFalse(test1.setDiameter(-7.0));
   }
    
   /**
    * Tests the perimeter method from the Quatrefoil class.
    */
   @Test public void perimeterTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(10.996, test1.perimeter(), 0.001);
   }
   
   /**
    * Tests the perimeterInFt method from the Quatrefoil class.
    */
   @Test public void perimeterInFtTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(0.916, test1.perimeterInFt(), 0.001);
   }
   
   /**
    * Tests the area method from the Quatrefoil class.
    */
   @Test public void areaTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(7.873, test1.area(), 0.001);
   }
   
   /**
    * Tests the areaInSqFt method from the Quatrefoil class.
    */
   @Test public void areaInSqFt() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(0.055, test1.areaInSqFt(), 0.001);
   }
   
   /**
    * Tests the toString method from the Quatrefoil class.
    */
   @Test public void toStringTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(test1.toString().contains("\"Small Example\""));
   }
   
   /**
    * Tests the resetCount and getCount method from the Quatrefoil class.
    */
   @Test public void resetCountTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      test1.resetCount();
      Assert.assertEquals(0, test1.getCount(), 0.0001);
   }
   
   /**
    * Tests the hashCode method from the Quatrefoil class.
    */
   @Test public void hashcodeTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(0, test1.hashCode(), 0.0001);
   }
   
   /**
    * Tests the equals method from the Quatrefoil class by
    * expecting true to be returned.
    */
   @Test public void equalsT() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(test1.equals(test1));
   }
   
   /**
    * Tests the equals method from the Quatrefoil class by
    * expecting false to be returned.
    */
   @Test public void equalsF() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertFalse(test1.equals(2.0));
   }
   

//    /** A test that always fails. **/
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
}
