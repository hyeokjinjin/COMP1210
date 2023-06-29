import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * Class that will display a menu and ask the user for input
 * depending on user's choice.
 *
 * Project 6
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 2/22/2023
 *
 */
public class HeartShapedBoxListMenuApp {
/**
 * Displays a menu asking the user if he or she wants to
 * read a file, print HeartShapedBox list, print summary,
 * add HeartShapedBox, delete HeartShapedBox, find HeartShapedBox,
 * edit HeartShapedBox, or quit program.
 *
 * @param args - is not used.
 * @throws FileNotFoundException if the file cannot be opened.
 */
   public static void main(String[] args) throws FileNotFoundException {
      String hListName = "*** no list name assigned ***";
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
      HeartShapedBoxList myHeartList = new 
         HeartShapedBoxList(hListName, myList);
      String fileName = "no file name";
   
   
      Scanner scan = new Scanner(System.in);
      System.out.println("HeartShapedBox List System Menu\n"
                       + "R - Read File and Create HeartShapedBox List\n"
                       + "P - Print HeartShapedBox List\n" 
                       + "S - Print Summary\n"
                       + "A - Add HeartShapedBox\n"   
                       + "D - Delete HeartShapedBox\n"   
                       + "F - Find HeartShapedBox\n"
                       + "E - Edit HeartShapedBox\n"
                       + "Q - Quit");
      String code = "";
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': 
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               myHeartList = myHeartList.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "HeartShapedBox List created\n");
               break; 
                    
            case 'P':  
               System.out.println("\n" + myHeartList);              
               break;
               
            case 'S': 
               System.out.println("\n" + myHeartList.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               String newLabel = (scan.nextLine());
               System.out.print("\tRadius: ");
               double newRadius = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               double newHeight = Double.parseDouble(scan.nextLine());
            
               myHeartList.addHeartShapedBox(newLabel, newRadius, newHeight);
               System.out.println("\t*** HeartShapedBox added ***\n");
               break;
         
            case 'D':
               System.out.print("\tLabel: ");
               String delLabel = (scan.nextLine());
               if (myHeartList.deleteHeartShapedBox(delLabel) == null) {
                  System.out.println("\t\"" + delLabel + "\" not found\n");
               }
               else {
                  myHeartList.deleteHeartShapedBox(delLabel);
                  System.out.println("\t\"" + delLabel + "\" deleted\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               String findLabel = (scan.nextLine());
               if (myHeartList.findHeartShapedBox(findLabel) == null) {
                  System.out.println("\t\"" + findLabel + "\" not found\n");
               }
               else {
                  System.out.println(
                     myHeartList.findHeartShapedBox(findLabel) + "\n");
               }
               break;   
               
            case 'E':
               System.out.print("\tLabel: ");
               String editLabel = (scan.nextLine());
               System.out.print("\tRadius: ");
               double editRadius = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               double editHeight = Double.parseDouble(scan.nextLine());
               if (myHeartList.editHeartShapedBox(
                  editLabel, editRadius, editHeight)) {
                  myHeartList.editHeartShapedBox(
                     editLabel, editRadius, editHeight);
                  editLabel = 
                     myHeartList.findHeartShapedBox(editLabel).getLabel();
                  System.out.println(
                     "\t\"" + editLabel + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + editLabel + "\" not found\n");    
               }
            
               break;   
                  
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
               break; 
         }
      
      } while (!code.equalsIgnoreCase("Q"));
                       
   }
}