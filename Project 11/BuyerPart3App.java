import java.io.FileNotFoundException;
/**
 * Class containing main method to generate a report with
 * an input of a file name that is to be read.
 *
 * Project 11
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/27/2023
 */
public class BuyerPart3App {
  /**
   * Method that takes command line argument and finds a file to be read 
   * in order to generate report.
   * @param args Command line argument used to find a file name in directory.
   */
   public static void main(String[] args) {
      String[] test = new String[0];
      try {
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
            System.out.println(bp.generateInvalidRecordsReport());
         }
      }
      catch (FileNotFoundException exepObj) {
         System.out.println("Attempted to read file: " 
            + args[0] + " (No such file or directory)");
         System.out.println("Program ending.");
      }
   }
}