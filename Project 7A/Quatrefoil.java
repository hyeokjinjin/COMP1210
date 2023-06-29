import java.text.DecimalFormat;
/**
 *
 * Class that contains methods in order to calculate 
 * various aspects (ie. perimeter and area) of quatrefoil. 
 *
 * Project 7A
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 3/17/2023
 *
 */
public class Quatrefoil {
   private String label = "";
   private double largeDiameter = 0;
   private static int count = 0;
   
   /**
    * Takes two inputted parameters in which they are set to
    * their respective instance variables.
    *
    * @param labelIn Inputted string of label
    * @param largeDiameterIn Inputted double of diameter
    */
   public Quatrefoil(String labelIn, double largeDiameterIn) {
      setLabel(labelIn);
      setDiameter(largeDiameterIn);
      count++;
   }
   
   /**
    * Returns label for method getLabel().
    * @return label
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Returns a boolean whether or not the label was
    * set to a new label that is not "null".
    * 
    * @param setLabelIn Inputted string that the label is set to.
    * 
    * @return true or false depending on whether or not the
    * setLabelIn is null.
    */
   public boolean setLabel(String setLabelIn) {
      if (setLabelIn != null) {
         label = setLabelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Returns diameter for method getDiameter().
    * @return largeDiameter
    */
   public double getDiameter() {
      return largeDiameter;
   }
   
   /**
    * Returns a boolean whether or not the diameter
    * was set to a new diameter that is greater than 0.
    * 
    * @param setDiameterIn Inputted double that the diameter is set to.
    * 
    * @return true or false depending on whether or not the
    * setDiameter is greater than zero.
    */
   public boolean setDiameter(double setDiameterIn) {
      if (setDiameterIn > 0) {
         largeDiameter = setDiameterIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Returns the calculated perimeter in inches.
    *
    * @return perimeter.
    */
   public double perimeter() {
      double perimeter = (Math.PI * largeDiameter);
      return perimeter;
   }
   
   /** 
    * Returns the calculated perimeter in feet.
    *
    * @return perimeter in ft.
    */
   public double perimeterInFt() {
      double perimeter = (Math.PI * largeDiameter);
      return (perimeter / 12);
   }
   
   /**
    * Returns the calculated area in square inches.
    *
    * @return area
    */
   public double area() {
      double area = (Math.pow((largeDiameter / 2), 2)
         + 2 * (Math.PI * Math.pow((largeDiameter / 2), 2) / 4));
      return area;
   }
   
   /**
    * Returns the calculated area in square feet.
    *
    * @return area in sq. ft.
    */
   public double areaInSqFt() {
      double area = (Math.pow((largeDiameter / 2), 2)
         + 2 * (Math.PI * Math.pow((largeDiameter / 2), 2) / 4));
      return (area / 144);
   }
   
   /**
    * Creates the final string message with each variable that will be outputed.
    *
    * @return output
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Quatrefoil \"" + getLabel() + "\" with diameter "
         + getDiameter() + " inches has:\n";
      output += "\tperimeter = " + df.format(perimeter()) + " inches (or "
         + df.format(perimeterInFt()) + " feet)\n";
      output += "\tarea = " + df.format(area()) + " square inches (or "
         + df.format(areaInSqFt()) + " square feet)";
      return output;
   }
   
   /**
    * Method that returns the count of how many quatrefoil
    * objects were made.
    * 
    * @return count.
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * Method that resets the count of how many quatrefoil objects
    * were made.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * Method required for equals method.
    *
    * @return 0.
    */
   public int hashCode() {
      return 0;
   }
   
   
   /**
    * Method that returns a boolean by testing whether or not
    * inputted object is a quatrefoil object or not.
    *
    * @param obj Inputted object that is tested whether it is a quatrefoil
    * object or not.
    *
    * @return true or false depending on the parameter's object type.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Quatrefoil)) {
         return false;
      }
      else {
         Quatrefoil qf = (Quatrefoil) obj;
         return (label.equalsIgnoreCase(qf.getLabel())
            && Math.abs(largeDiameter - qf.getDiameter()) < .000001);
      }
   }
   

   
}