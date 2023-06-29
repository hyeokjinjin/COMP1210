import java.util.Scanner;
/**
 *
 * Class that creates instances of HeartShapedBox and invokes
 * the containted methods from HeartShapedBox.java on these instances.
 *
 * Project 4
 * Hyeokjin Jin - COMP 1210 - D01
 * 2/10/2023
 *
 */
public class HeartShapedBoxApp {
   /**
    *
    * Takes label, radius, and height input from user
    * in order to invoke methods from HeartShapedBox.
    *
    * @param args Command line arguments - not used.
    *
    */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label, radius, and height "
         + "for a heart shaped box.");
      System.out.print("\t" + "label: ");
      String userLabel = scan.nextLine();
      
      System.out.print("\t" + "radius: ");
      double userRadius = scan.nextDouble();
      if (userRadius <= 0) {
         System.out.println("Error: radius must be greater than zero.");
         return;
      }
      
      System.out.print("\t" + "height: ");
      double userHeight = scan.nextDouble();
      if (userHeight <= 0) {
         System.out.println("Error: height must be greater than zero.");
         return;
      }
      
      System.out.println();
      HeartShapedBox ex = new HeartShapedBox(userLabel, userRadius, userHeight);
      System.out.println(ex);
      
     
   }


}