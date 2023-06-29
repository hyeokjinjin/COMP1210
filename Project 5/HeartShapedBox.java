import java.text.DecimalFormat;
/**
 *
 * Class that contains methods in order to calculate 
 * various aspects (ie. surface area and volume) of a heart shaped box. 
 *
 * Project 5
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 2/17/2023
 *
 */
public class HeartShapedBox {
   private String label = "";
   private Double radius = 0.0;
   private Double height = 0.0;
   
   /**
    * Takes three inputted parameters in which they are set to
    * their respective instance variables.
    *
    * @param labelIn Inputted string of label
    * @param radiusIn Inputted doulbe of radius
    * @param heightIn Inputted double of height
    */
   public HeartShapedBox(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
   }
   
   //methods
   /**
    * Creates the final string message with each variable that will be outputed.
    * @return output
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "HeartShapedBox \"" + label + "\" with radius "
         + radius + " units and height " + height + " units:" + "\n";
      output += "\t" + "heart shaped area = " + df.format(heartShapedArea()) 
         + " square units" + "\n";
      output += "\t" + "lateral surface area = " 
         + df.format(lateralSurfaceArea()) + " square units" + "\n";
      output += "\t" + "total surface area = " + df.format(totalSurfaceArea())
         + " square units" + "\n";
      output += "\t" + "volume = " + df.format(volume()) 
         + " cubic units";   
      return output;
   }
   
   /**
    * Returns label for method getLabel().
    * @return label
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Uses If-Else Statement and boolean to decide if 
    * inputted label is null, and if not, label is trimmed.
    * @param labelIn Inputted string of the label
    * @return isSet
    */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
   
   /**
    * Returns radius for method getRadius().
    * @return radius
    */
   public Double getRadius() {
      return radius;
   }
   
   /**
    * Uses If-Else Statement and boolean to decide if
    * inputted radius is 0, and if not, radius is set to input.
    * @param radiusIn User's inputted radius
    * @return isSet
    */
   public boolean setRadius(Double radiusIn) {
      boolean isSet = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
      }
      else {
         isSet = false;
      }
      return isSet;
   }

   /**
    * Returns height for method getHeight().
    * @return height
    */
   public Double getHeight() {
      return height;
   }
   
   /**
    * Uses If-Else Statement and boolean to decide if
    * inputted height is 0, and if not, height is set to input.
    * @param heightIn User's inputted height
    * @return isSet
    */
   public boolean setHeight(Double heightIn) {
      boolean isSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isSet = true;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
   
   /**
    * Calculates the area of the heart shape.
    * @return area of heart shape
    */
   public Double heartShapedArea() {
      return ((Math.PI * Math.pow(radius, 2)) + (4 * Math.pow(radius, 2)));
   }
   
   /**
    * Calculates lateral surface area.
    * @return lateral surface area
    */
   public Double lateralSurfaceArea() {
      return (height * (4 * radius + (2 * Math.PI * radius)));
   }
   
   /**
    * Calcuates the total surface area.
    * @return total surface area
    */ 
   public Double totalSurfaceArea() {
      return (2 * ((Math.PI * Math.pow(radius, 2)) + (4 * Math.pow(radius, 2))))
         + (height * (4 * radius + (2 * Math.PI * radius)));
   }
   
   /**
    * Calculates the volume of the heart shaped box.
    * @return volume of heart shaped box
    */
   public Double volume() {
      return (height * ((Math.PI * Math.pow(radius, 2))
         + (4 * Math.pow(radius, 2))));
   }

}