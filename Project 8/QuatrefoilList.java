import java.text.DecimalFormat;
/**
 *
 * Class that contains methods in order to calculate various
 * aspects (ie. total/average diameter, perimeter, and area)
 * of an array containing multiple quatrefoils.
 *
 * Project 8
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 3/30/2023
 *
 */
public class QuatrefoilList {

   private String listName;
   private Quatrefoil[] qList;
   private int numOfQuatrefoil;
   
   /**
    * Takes in three parameters and sets it equal to respective
    * instance variables.
    *
    * @param listNameIn Inputted name of list.
    *
    * @param qListIn Inputted array of quatrefoil objects.
    *
    * @param numOfQuatrefoilIn Inputted integer of the number of Quatrefoil
    * objects in the array.
    */
   public QuatrefoilList(String listNameIn, Quatrefoil[] qListIn,
      int numOfQuatrefoilIn) {
      listName = listNameIn;
      qList = qListIn;
      numOfQuatrefoil = numOfQuatrefoilIn;
   }
   
   /**
    * Method that returns the name of the array.
    *
    * @return listName.
    */
   public String getName() {
      return listName;
   }
   
   /**
    * Method that returns the number of quatrefoil objects in array.
    *
    * @return numOfQuatrefoil.
    */
   public int numberOfQuatrefoils() {
      return numOfQuatrefoil;
   }
   
   /**
    * Calculates the total diameter of the quatrefoil
    * objects in the array.
    *
    * @return total Total diameter of all quatrefoil objects.
    */
   public double totalDiameters() {
      double total = 0;
      int index = 0;
      while (index < numOfQuatrefoil) {
         total += qList[index].getDiameter();
         index++;
      }
      return total;
   }
   
   /**
    * Calculates the total perimeter of the quatrefoil
    * objects in the array.
    *
    * @return total Total perimeter of all quatrefoil objects.
    */
   public double totalPerimeters() {
      double total = 0;
      int index = 0;
      while (index < numOfQuatrefoil) {
         total += qList[index].perimeter();
         index++;
      }
      return total;
   }
   
   /**
    * Calculates the total area of the quatrefoil
    * objects in the array.
    *
    * @return total Total area of all quatrefoil objects.
    */
   public double totalAreas() {
      double total = 0;
      int index = 0;
      while (index < numOfQuatrefoil) {
         total += qList[index].area();
         index++;
      }
      return total;
   }
   
   /**
    * Calculates the average diameter of the quatrefoil
    * objects in the array.
    *
    * @return avg Average diameter of all quatrefoil objects.
    */
   public double averageDiameter() {
      double avg = 0;
      if (numOfQuatrefoil > 0) {
         double total = 0;
         int index = 0;
         while (index < numOfQuatrefoil) {
            total += qList[index].getDiameter();
            index++;
         }
         avg = (total / numOfQuatrefoil);
      }
      else {
         avg = 0;
      }
      return avg;
   }
   
   /**
    * Calculates the average perimeter of the quatrefoil
    * objects in the array.
    *
    * @return avg Average perimeter of all quatrefoil objects.
    */
   public double averagePerimeter() {
      double avg = 0;
      if (numOfQuatrefoil > 0) {
         double total = 0;
         int index = 0;
         while (index < numOfQuatrefoil) {
            total += qList[index].perimeter();
            index++;
         }
         avg = (total / numOfQuatrefoil);
      }
      else {
         avg = 0;
      }
      return avg;
   }
   
   /**
    * Calculates the average area of the quatrefoil
    * objects in the array.
    *
    * @return avg Average area of all quatrefoil objects.
    */
   public double averageArea() {
      double avg = 0;
      if (numOfQuatrefoil > 0) {
         double total = 0;
         int index = 0;
         while (index < numOfQuatrefoil) {
            total += qList[index].area();
            index++;
         }
         avg = (total / numOfQuatrefoil);
      }
      else {
         avg = 0;
      }
      return avg;
   }
   
   /**
    * Creates the final string message with each variable that will be outputed.
    *
    * @return output.
    */
   public String toString() {
      String output = "";
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      output += "----- Summary for " + listName + " -----\n";
      output += "Number of Quatrefoils: " + numOfQuatrefoil + "\n";
      output += "Total Diameters: " + df.format(totalDiameters()) + " inches\n";
      output += "Total Perimeters: " 
         + df.format(totalPerimeters()) + " inches\n";
      output += "Total Areas: " 
         + df.format(totalAreas()) + " square inches\n";
      output += "Average Diameter: " 
         + df.format(averageDiameter()) + " inches\n";
      output += "Average Perimeter: " 
         + df.format(averagePerimeter()) + " inches\n";
      output += "Average Area: " 
         + df.format(averageArea()) + " square inches\n";
      return output;
   }
   
   /**
    * Returns the array containing Quatrefoil objects.
    *
    * @return qList.
    */
   public Quatrefoil[] getList() {
      return qList;
   }
   
   /**
    * Method that adds a new Quatrefoil object to the array
    * by taking the objects label and diameter.
    *
    * @param labelIn New Quatrefoil's label.
    *
    * @param diameterIn New Quatrefoil's diameter.
    */
   public void addQuatrefoil(String labelIn, double diameterIn) {
      Quatrefoil nQ = new Quatrefoil(labelIn, diameterIn);
      Quatrefoil[] newQList = new Quatrefoil[(qList.length + 1)];
      for (int i = 0; i < (qList.length); i++) {
         newQList[i] = qList[i];
      }
      newQList[numOfQuatrefoil] = nQ;
      qList = newQList;
      numOfQuatrefoil++;
   }
   
   /**
    * Method that finds a quatrefoil object within the array
    * by finding the label.
    *
    * @param fLabelIn Inputted label that is used to find the
    * quatrefoil object.
    *
    * @return qList[i] or null depending on if a quatrefoil 
    * object is found or not. 
    */
   public Quatrefoil findQuatrefoil(String fLabelIn) {
      String findLabel = "";
      for (int i = 0; i < numOfQuatrefoil; i++) {
         findLabel = qList[i].getLabel();
         if (fLabelIn.equalsIgnoreCase(findLabel)) {
            return qList[i];
         }
      }
      return null;
   }
   
   /**
    * Method that deletes a quatrefoil object within the array
    * by finding the label.
    *
    * @param fLabelIn Inputted label that is used to find the
    * quatrefoil object.
    *
    * @return returnQ or null depending on if a quatrefoil 
    * object is found or not. 
    */
   public Quatrefoil deleteQuatrefoil(String fLabelIn) {
      String findLabel = "";
      for (int i = 0; i < numOfQuatrefoil; i++) {
         findLabel = qList[i].getLabel();
         if (fLabelIn.equalsIgnoreCase(findLabel)) {
            Quatrefoil returnQ = qList[i];
            for (int j = i; j < numOfQuatrefoil - 1; j++) {
               qList[j] = qList[j + 1];
            }
            qList[numOfQuatrefoil - 1] = null;
            numOfQuatrefoil--;
            return returnQ;
         }
      }
      return null;
   }
   
   /**
    * Method that edits the diameter of a quatrefoil object found
    * in the array with an inputted label name.
    *
    * @param fLabelIn Inputted label that is used to find the
    * quatrefoil object.
    *
    * @param diameterIn Inputted diameter that the quatrefoil's
    * diameter is changed to.
    *
    * @return true or false depending on if a quatrefoil object was
    * found within the array with the inputted label.
    */
   public boolean editQuatrefoil(String fLabelIn, double diameterIn) {
      String findLabel = "";
      for (int i = 0; i < numOfQuatrefoil; i++) {
         findLabel = qList[i].getLabel();
         if (fLabelIn.equalsIgnoreCase(findLabel)) {
            qList[i].setDiameter(diameterIn);
            return true;
         }
      }
      return false;
   }
   
   /**
    * Method that calculates and returns the quatrefoil with
    * the largest diameter.
    * @return largestDiameter or null depending on if the array 
    * has objects or not.
    */
   public Quatrefoil findQuatrefoilWithLargestDiameter() {
      if (qList.length > 0) {
         int index = 0;
         Quatrefoil[] largeDia = new Quatrefoil[1];
         largeDia[0] = qList[0];
         while (index < numOfQuatrefoil) {
            if (largeDia[0].getDiameter() < qList[index].getDiameter()) {
               largeDia[0] = qList[index];
            }
            index++;
         }
         return largeDia[0];
      }
      else {
         return null;
      }
   
   }
   
}