import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * Program that inputs a hotel bill code to
 * split and read specific parts to find the 
 * guest's name, room number, price per night
 * check-in date, and number of nights stayed.
 *
 * Project 3
 * Hyeokjin Jin - COMP 1210 - D01
 * 2/2/2023
 */
public class HotelBill {
   /**
    * Creates variables consisting of strings and doubles
    * in order to read and save specific parts of the bill code.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
   
      // Declares strings that will be used to save parts of the bill code:
      Scanner userInput = new Scanner(System.in);
      String billCode = "";
      String name = "";
      String room = "";
      String checkDate = "";
      String nights = "";
      String cost = "";
       
      // Save the user's hotel bill code input: 
      System.out.print("Enter hotel bill code: ");
      billCode = userInput.nextLine();
      billCode = billCode.trim();
   
      // If-Else statement to discern if bill code length >= 22 characters long.
      if (billCode.length() >= 22) {
      
         // Finds the guest's name:
         name = billCode.substring(21, billCode.length());
         System.out.println();
         System.out.println("Name: " + name);
         
         // Finds the guest's room number:
         room = billCode.substring(0, 3);
         System.out.println("Room: " + room);
      
         // Finds the guest's check-in date:
         checkDate = billCode.substring(9, 19);
         System.out.println("Check-in Date: " + checkDate);
         
         // Find the guest's number of nights stayed:
         nights = billCode.substring(19, 21);
         
         // If-Else statement to shorten one digit numbers:
         if (nights.charAt(0) == '0') {
            System.out.println("Nights: " + nights.substring(1));
         }
         else {
            System.out.println("Nights: " + nights);
         }
         
         // Finds and calculates room cost, tax, and total cost per night:
         DecimalFormat df = new DecimalFormat("#,##0.00");
         double roomCost = Double.parseDouble(billCode.substring(3, 9));
         double tax = roomCost * 0.15;
         double costPerNight = roomCost * 1.15;
         System.out.println("Cost Per Night: $" + df.format(costPerNight)
            + "   (Room: $" + df.format(roomCost) 
            + "   Tax: $" + df.format(tax) + ")"); 
         System.out.println("Total: $"
            + df.format(costPerNight * Double.parseDouble(nights)));
         
         // Generates a random new lucky number:
         Random generator = new Random();
         DecimalFormat df2 = new DecimalFormat("000000");
         System.out.println("Lucky Number: "
            + df2.format(generator.nextInt(1000000)));
      }
      
      else {
         
         System.out.println();
         System.out.println("Invalid Hotel Bill Code.");
         System.out.println("Hotel Bill Code must have "
            + "at least 22 characters.");
      
      }
   
   }

}