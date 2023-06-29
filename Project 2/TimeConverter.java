import java.util.Scanner;
/**
 * Program that calculates and displays the time as
 * days, hours, minutes, and seconds with the input of seconds.
 * 
 * Project 2
 * Hyeokjin Jin - COMP1210 - D01
 * 1/27/23
 */
public class TimeConverter {
/** 
 *
 * Creates variable for the program and utilizes the input of 
 * seconds to calculate the rest of the time.
 *
 * @param args Command line arguments - not used.
 *
 */
   public static void main(String[] args) {
   
      //Declares variables used for the program:
      Scanner userInput = new Scanner(System.in);
      int days, hours, minutes, seconds, newSeconds;
      
      //Takes user's input of seconds and calculates the time:
      System.out.print("Enter the raw time measurement in seconds: ");
      seconds = userInput.nextInt();
      days = seconds / 86400;
      hours = (seconds % 86400) / 3600;
      minutes = ((seconds % 86400) % 3600) / 60;
      newSeconds = ((seconds % 86400) % 3600) % 60;
      
      //Utilizes If-Else statement to discern if the inpuut is negative or not:
      if (seconds < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      else {
         System.out.println();
         System.out.println("Measurement by combined days, hours, "
            + "minutes, seconds: ");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + newSeconds);
         
         System.out.println();
         System.out.print(seconds + " seconds = " + days + " days, "
            + hours + " hours, " + minutes + " minutes, "
            + newSeconds + " seconds");
      }
   }
}