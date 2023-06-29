import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * Class opens, reads, closes, and displays a file with
 * the label name, radius, and height for HeartShapedBoxes.
 *
 * Project 5
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 2/17/2023
 *
 */
public class HeartShapedBoxListApp {

   /**
    * Uses the user's input to search for file and opens it in order
    * to read the label, radius, and height for HeartShapedBoxes.
    *
    * @param args Command line arguments - not used
    * @throws FileNotFoundException required by Scanner for File
    */
   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
   
      Scanner scanFile = new Scanner(new File(fileName));
   
      String heartListName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
         String title = scanFile.nextLine();
         double radius = scanFile.nextDouble();
         double height = scanFile.nextDouble();
         HeartShapedBox ex = new HeartShapedBox(title, radius, height);
         myList.add(ex);
         scanFile.nextLine();
      }
   
      scanFile.close();
      
      HeartShapedBoxList myHeartList =
         new HeartShapedBoxList(heartListName, myList);
   
      System.out.println("\n" + myHeartList);
      
      System.out.println("\n" + myHeartList.summaryInfo());
   
   }
   
}