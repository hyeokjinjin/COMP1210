import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
 *
 * Class that contains multiple methods that will calculate various 
 * equations for an inputted list of heart shaped boxes.
 *
 * Project 6
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 2/22/2023
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
   
   /**
    * Returns the arraylist containing HeartShapedBox objects.
    * @return hList Arraylist consisted of HeartShapedBox objects
    */
   public ArrayList<HeartShapedBox> getList() {
      return hList;
   }
   
   /**
    * Takes the string parameter and reads a file named whatever the parameter
    * is and then scans the file line by line to
    * add a HeartShapedBox to an array list.
    *
    * @param nameIn Name of the file that is to be read
    * @return myHeartList Array list of HeartShapedBox objects created
    * from read file
    * @throws FileNotFoundException if the file cannot be opened
    */
   public HeartShapedBoxList readFile(String nameIn) 
                                 throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(nameIn));
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
      String heartListName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
         String title = scanFile.nextLine();
         double radius = scanFile.nextDouble();
         double height = scanFile.nextDouble();
         HeartShapedBox ex = new HeartShapedBox(title, radius, height);
         myList.add(ex);
         scanFile.nextLine();
      }
      
      HeartShapedBoxList myHeartList =
         new HeartShapedBoxList(heartListName, myList);
      
      return myHeartList;
   }
   
   /**
    * Adds a new HeartShapedBox object to hList from user's inputs.
    * @param labelIn User's label for added HeartShapedBox
    * @param radiusIn User's radius for added HeartShapedBox
    * @param heightIn User's height for added HeartShapedBox
    */
   public void addHeartShapedBox(String labelIn,
      double radiusIn, double heightIn) {
      HeartShapedBox newHSB = new HeartShapedBox(labelIn, radiusIn, heightIn);
      hList.add(newHSB);
   }
   
   /**
    * Returns a HeartShapedBox found by the user's inputted label.
    *
    * @param findLabel User's inputted label that is to be
    * searched within the list
    * @return foundHSB The found HeartShapedBox is returned
    */
   public HeartShapedBox findHeartShapedBox(String findLabel) {
      HeartShapedBox foundHSB = null;
      for (HeartShapedBox hsb : hList) {
         if (hsb.getLabel().equalsIgnoreCase(findLabel)) {
            foundHSB = hsb;
            break;
         }
      }
      return foundHSB;
   }
   
   /**
    * Deletes a HeartShapedBox object from list found by user's
    * inputted label.
    *
    * @param labelIn User's inputted label that is to be searched
    * within the list to find the object to be deleted
    * @return foundHSB The found and deleted HeartShapedBox is returned
    */
   public HeartShapedBox deleteHeartShapedBox(String labelIn) {
      HeartShapedBox foundHSB = null;
      for (HeartShapedBox hsb : hList) {
         if (hsb.getLabel().equalsIgnoreCase(labelIn)) {
            foundHSB = hsb;
            int index = hList.indexOf(hsb);
            hList.remove(index);
            break;
         }
      }
      return foundHSB;
   }
   
   /**
    * Edits a HeartShapedBox object from the list found
    * by user's inputted label.
    *
    * @param labelIn User's inputted label that is to be searched
    * within the list
    * @param radiusIn User's inputted radius that is to be edited
    * @param heightIn User's inputted height that is to be edited
    * @return result Boolean result that shows if HeartShapedBox is edited.
    */
   public boolean editHeartShapedBox(String labelIn,
      double radiusIn, double heightIn) {
      boolean result = false;
      for (HeartShapedBox hsb : hList) {
         if (hsb.getLabel().equalsIgnoreCase(labelIn)) {
            hsb.setRadius(radiusIn);
            hsb.setHeight(heightIn);
            result = true;
            break;
         }
      }
      return result;
   }
   
   
}