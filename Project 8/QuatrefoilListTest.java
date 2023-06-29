import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * Class that contains methods that tests methods from
 * the QuatrefoilList.java class.
 *
 * Project 8
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 3/30/2023
 *
 */
public class QuatrefoilListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Tests the getName() method from QuatrefoilList class.
    */
   @Test public void getNameTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals("Quatrefoil Test List", test.getName());
   }
   
   /**
    * Tests the numberOfQuatrefoilsTest() method from QuatrefoilList class.
    */
   @Test public void numberOfQuatrefoilsTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(2, test.numberOfQuatrefoils(), 0.00001);
   }
   
   /**
    * Tests the totalDiameters() method from QuatrefoilList class.
    */
   @Test public void totalDiametersTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(41.94, test.totalDiameters(), 0.00001);
   }
   
   /**
    * Tests the totalPerimeters() method from QuatrefoilList class.
    */
   @Test public void totalPerimetersTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(131.758, test.totalPerimeters(), 0.001);
   }

   /**
    * Tests the totalAreas() method from QuatrefoilList class.
    */
   @Test public void totalAreasTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(957.547, test.totalAreas(), 0.001);
   }
   
   /**
    * Tests the averageDiameter() method from QuatrefoilList class.
    */
   @Test public void averageDiameterTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(20.97, test.averageDiameter(), 0.001);
   }
   
   /**
    * Tests the averageDiameter() method from QuatrefoilList class
    * with an expectation of numOfQuatrefoils to be 0.
    */
   @Test public void averageDiameterTest2() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 0);
      Assert.assertEquals(0, test.averageDiameter(), 0.001);
   }
   
   
   /**
    * Tests the averagePerimeter() method from QuatrefoilList class.
    */
   @Test public void averagePerimeterTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(65.879, test.averagePerimeter(), 0.001);
   }
   
   /**
    * Tests the averagePerimeter() method from QuatrefoilList class
    * with an expectation of numOfQuatrefoils to be 0.
    */
   @Test public void averagePerimeterTest2() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 0);
      Assert.assertEquals(0, test.averagePerimeter(), 0.001);
   }
   
   /**
    * Tests the averageArea() method from QuatrefoilList class.
    */
   @Test public void averageAreaTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(478.773, test.averageArea(), 0.001);
   }
   
   /**
    * Tests the averageArea() method from QuatrefoilList class
    * with an expectation of numOfQuatrefoils to be 0.
    */
   @Test public void averageAreaTest2() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 0);
      Assert.assertEquals(0, test.averageArea(), 0.001);
   }
   
   /**
    * Tests the toString method from the QuatrefoilList class.
    */
   @Test public void toStringTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertTrue(test.toString().contains("41.94"));
   }
   
   /**
    * Tests the getList method from the QuatrefoilList class.
    */
   @Test public void getListTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Quatrefoil[] getListTestArray = test.getList();
      Assert.assertArrayEquals(getListTestArray, test.getList());
   }
   
   /**
    * Tests the addQuatrefoil method from the QuatrefoilList class.
    */
   @Test public void addQuatrefoilTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      test.addQuatrefoil("Large example", 111.4);
      Assert.assertEquals(3, test.numberOfQuatrefoils(), 0.00001);
   }
   
   /**
    * Tests the findQuatrefoil method from the QuatrefoilList class.
    */
   @Test public void findQuatrefoilTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertNotEquals(test.findQuatrefoil("Small Example"), 
         test.findQuatrefoil("medium Example"));
   }
   
   /**
    * Tests the findQuatrefoil method from the QuatrefoilList class
    * by expecting null.
    */
   @Test public void findQuatrefoilTest2() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(test.findQuatrefoil("mediusm example"), null);
   }
   
   /**
    * Tests the deleteQuatrefoil method from the QuatrefoilList class.
    */
   @Test public void deleteQuatrefoilTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(test.findQuatrefoil("small Example"),
         test.deleteQuatrefoil("small Example"));
   }
   
   /**
    * Tests the deleteQuatrefoil method from the QuatrefoilList class.
    */
   @Test public void deleteQuatrefoilTest2() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil[] list = {ex1};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 1);
      Assert.assertEquals(test.findQuatrefoil("small Example"),
         test.deleteQuatrefoil("small Example"));
   }
   
   /**
    * Tests the deleteQuatrefoil method from the QuatrefoilList class
    * with an expected null return.
    */
   @Test public void deleteQuatrefoilTest3() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(test.deleteQuatrefoil("medaium example"), null);
   }
   
   /**
    * Tests the editQuatrefoil method from the QuatrefoilList class.
    */
   @Test public void editQuatrefoilTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertTrue(test.editQuatrefoil("medium Example", 12));
   }
   
   /**
    * Tests the editQuatrefoil method from the QuatrefoilList class with
    * an expectation to return false.
    */
   @Test public void editQuatrefoilTest2() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertFalse(test.editQuatrefoil("Example", 12));
   }
   
   /**
    * Tests the findQuatrefoilWithLargestDiameter method 
    * from the QuatrefoilList class.
    */
   @Test public void findQuatrefoilWithLargestDiameterTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(test.findQuatrefoil("Medium Example"), 
         test.findQuatrefoilWithLargestDiameter());
   }
   
   /**
    * Tests the findQuatrefoilWithLargestDiameter method 
    * from the QuatrefoilList class.
    */
   @Test public void findQuatrefoilWithLargestDiameterTest2() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 388.5);
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil[] list = {ex1, ex2};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 2);
      Assert.assertEquals(test.findQuatrefoil("small Example"), 
         test.findQuatrefoilWithLargestDiameter());
   }
   
   /**
    * Tests the findQuatrefoilWithLargestDiameter method 
    * from the QuatrefoilList class with an expected null return.
    */
   @Test public void findQuatrefoilWithLargestDiameterTest3() {
      Quatrefoil[] list = {};
      QuatrefoilList test = new QuatrefoilList("Quatrefoil Test List", list, 0);
      Assert.assertEquals(test.findQuatrefoilWithLargestDiameter(), null);
   }

//    /** A test that always fails. **/
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
}
