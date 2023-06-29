import java.io.FileNotFoundException;
/**
 * Class containing main method to generate a report with
 * an input of a file name that is to be read.
 *
 * Project 10
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/20/2023
 */
public class BuyerPart2App {
  /**
   * Method that takes command line argument and finds a file to be read 
   * in order to generate report.
   * @throws FileNotFoundException Throws an exception if file not found.
   * @param args Command line argument used to find a file name in directory.
   */
   public static void main(String[] args) throws FileNotFoundException {
      String[] test = new String[0];
      if (args.length == test.length) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         BuyerProcessor bp = new BuyerProcessor();
         bp.readBuyerFile(args[0]);
         System.out.println(bp.generateReport());
         System.out.println(bp.generateReportByName());
         System.out.println(bp.generateReportByTotalPurchases());
      }
   }
}