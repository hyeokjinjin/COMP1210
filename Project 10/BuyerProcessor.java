import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * Class containing methods in order to read a file
 * with Buyer objects and returns a report.
 *
 * Project 10
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 4/20/2023
 */
public class BuyerProcessor {
   
   private Buyer[] buyerArray;
   private String[] stringArray;
   
   /**
    * Method that sets the Buyer and string array to
    * an empty array.
    */
   public BuyerProcessor() {
      buyerArray = new Buyer[0];
      stringArray = new String[0];
   }
   
   /**
    * Method that returns the buyerArray.
    * @return buyerArray.
    */
   public Buyer[] getBuyerArray() {
      return buyerArray;
   }
   
   /**
    * Method that returns the invalidRecordsArray.
    * @return stringArray.
    */
   public String[] getInvalidRecordsArray() {
      return stringArray;
   }
   
   /**
    * Method that adds a Buyer object to the buyerArray.
    * @param addIn Inputted Buyer object that is to added.
    */
   public void addBuyer(Buyer addIn) {
      Buyer[] newBuyerArray = Arrays.copyOf(buyerArray, buyerArray.length + 1);
      newBuyerArray[newBuyerArray.length - 1] = addIn;
      buyerArray = newBuyerArray;
   }
   
   /**
    * Method that adds a string to the stringArray.
    * @param addIn Inputted string object that is to added.
    */
   public void addInvalidRecord(String addIn) {
      String[] newStringArray = 
         Arrays.copyOf(stringArray, stringArray.length + 1);
      newStringArray[newStringArray.length - 1] = addIn;
      stringArray = newStringArray;
   }
   
   /**
    * Method that reads line by line of a file and generates a report.
    * @param fileName Inputted name of file that is searched for.
    * @throws FileNotFoundException Throws FileNotFoundException 
    * if file not found.
    */
   public void readBuyerFile(String fileName) throws FileNotFoundException {
      Scanner buyerFile = new Scanner(new File(fileName));
      while (buyerFile.hasNextLine()) {
         Scanner lineReader = new Scanner(buyerFile.nextLine());
         int category = lineReader.nextInt();
         String acctNum = lineReader.next();
         String lastName = lineReader.next();
         String firstName = lineReader.next();
         String name = (lastName + ", " + firstName);
         double[] purchases = new double[0];
         while (lineReader.hasNextDouble()) {
            double[] newPurchases = 
               Arrays.copyOf(purchases, purchases.length + 1);
            newPurchases[purchases.length] = lineReader.nextDouble();
            purchases = newPurchases;
         }
         lineReader.close();
         switch (category) {
            case 1:
               PreferredBuyer label1 = new PreferredBuyer(acctNum, name);
               label1.setPurchases(purchases);
               addBuyer(label1);
               break;
               
            case 2:
               EliteBuyer label2 = new EliteBuyer(acctNum, name);
               label2.setPurchases(purchases);
               addBuyer(label2);
               break;
               
            case 3:
               PremierEliteBuyer label3 = new PremierEliteBuyer(acctNum, name);
               label3.setPurchases(purchases);
               addBuyer(label3);
               break;
               
            default:
               break;
         }
      }
      buyerFile.close();
   }
   
   /**
    * Method that generates a report in the order that is was listed in file.
    * @return output Generated report in original ordering.
    */
   public String generateReport() {
      String output = "----------------------------\n";
      output += "Buyer Report\n";
      output += "----------------------------\n";
      for (Buyer item : buyerArray) {
         output += item + "\n";
      }
      return output;
   }
   
   /**
    * Method that generates a report with the order based on name.
    * @return output Generated report in natural ordering.
    */
   public String generateReportByName() {
      Arrays.sort(buyerArray);
      String output = "--------------------------------------\n";
      output += "Buyer Report by Name\n";
      output += "--------------------------------------\n";
      for (Buyer item : buyerArray) {
         output += item + "\n";
      }
      return output;
   }
   
   /**
    * Method that generates a report with the order based on total purchases.
    * @return output Generated report ordering based on total purchases.
    */
   public String generateReportByTotalPurchases() {
      String output = "---------------------------------------\n";
      output += "Buyer Report by Total Purchases\n";
      output += "---------------------------------------\n";
      Arrays.sort(buyerArray, new TotalPurchasesCompare());
      for (Buyer item : buyerArray) {
         output += item + "\n";
      }
      return output;
   }
   
   
}