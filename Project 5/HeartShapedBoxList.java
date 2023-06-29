import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 *
 * Class that contains multiple methods that will calculate various 
 * equations for an inputted list of heart shaped boxes.
 *
 * Project 5
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 2/17/2023
 *
 */
public class HeartShapedBoxList {

   private String listName;
   private ArrayList<HeartShapedBox> hList;
   
   /**
    * Takes in parameters and sets it equal to their respective 
    * instance variable.
    *
    * @param listNameIn Inputted string that will be the name of list
    * @param hListIn Inputted array list that contains object HeartShapedBox
    */
   public HeartShapedBoxList(String listNameIn,
      ArrayList<HeartShapedBox> hListIn) {
      listName = listNameIn;
      hList = hListIn;
   }
   
   /**
    * Returns the list name for the method getName().
    *
    * @return listName
    */
   public String getName() {
      return listName;
   }
   
   /**
    * Returns the size of the arraylist hList.
    *
    * @return hList.size()
    */
   public int numberOfHeartShapedBoxes() {
      return hList.size();
   }
   
   /**
    * Returns the grand total surface area of the HeartShapedBoxes
    * in the array list hList through a while loop.
    *
    * @return total
    */
   public Double grandTotalSurfaceArea() {
      double total = 0;
      
      int index = 0;
      while (index < hList.size()) {
         total += hList.get(index).totalSurfaceArea();
         index++;
      }
      
      return total;
   }
   
   /**
    * Returns the grand total volume of the HeartShapedBoxes
    * in the array list hList through a while loop.
    *
    * @return total
    */
   public Double totalVolume() {
      double total = 0;
      
      int index = 0;
      while (index < hList.size()) {
         total += hList.get(index).volume();
         index++;
      }
      
      return total;
   }
   
   /**
    * Returns the average total surface area of the HeartShapedBoxes
    * in the array list hList through a if else statement and by calling
    * the grandTotalSurfaceArea() method.
    *
    * @return average
    */
   public Double averageTotalSurfaceArea() {
      double average = 0;
      if (hList.size() == 0) {
         average = 0;
      }
      else {
         average = grandTotalSurfaceArea() / hList.size();
      }
      return average;
   }
   
   /**
    * Returns the average total volume of the HeartShapedBoxes
    * in the array list hList through a if else statement and by calling
    * the totalVolume() method.
    *
    * @return average
    */
   public Double averageVolume() {
      double average = 0;
      if (hList.size() == 0) {
         average = 0;
      }
      else {
         average = totalVolume() / hList.size();
      }
      return average;
   }
   
   /**
    * Creates a string message that display the list name 
    * and each object in hList.
    * 
    * @return result
    */
   public String toString() {
      String result = "----- " + listName + " -----\n";
      int index = 0;
      while (index < hList.size()) {
         result += "\n" + hList.get(index) + "\n"; 
         index++;  
      }   
      return result;
   }
   
   /**
    * Creates a string message that display the 
    * calculated numbers from this class.
    * 
    * @return result
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + listName + " -----"; 
      result += "\nNumber of HeartShapedBoxes: " + numberOfHeartShapedBoxes();
      result += "\nTotal Surface Area: "
         + df.format(grandTotalSurfaceArea()) + " square units"; 
      result += "\nTotal Volume: "
         + df.format(totalVolume()) + " cubic units";
      result += "\nAverage Surface Area: "
         + df.format(averageTotalSurfaceArea()) + " square units";
      result += "\nAverage Volume: "
         + df.format(averageVolume()) + " cubic units";
      
      return result;
   }
   
}