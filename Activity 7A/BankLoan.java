   /**
 *
 * Class that contains methods in order to calculate
 * a customer's loan and how much is paid and due. 
 *
 * Activity 7A
 * @author Hyeokjin Jin - COMP 1210 - D01
 * @version 3/14/2023
 *
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   /**
    * Takes in two parameters, sets them equal to the respective
    * instance variables, and increments the amount of loans created.
    *
    * @param customerNameIn Inputted string of customer's name.
    * @param interestRateIn Inputted double of customer's interest rate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
    * Method that calculates how much money was borrowed and returns a boolean
    * if a loan was made by the customer.
    * @param amount Inputted double that is used to calculate
    * if the max loan amount is reached.
    * @return wasLoanMade
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
    * Method that calculate and returns the returning balance left to pay.
    * @param amountPaid Inputted double that represents the amount paid already
    * by the customer.
    * @return 0/Math.abs(newBalance) Returns either 0 or the overcharge.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    * Method tha returns the balance left to pay.
    * @return balance.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Method that sets the interest rate.
    * @param interestRateIn Newly inputted interest rate.
    * @return true/false Return true if the interest rate is greater or
    * equal to 0 and less than or equal to 1. Returns false if not.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Method that returns the interest rate.
    * @return interestRate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * Method that charges the interest rate to the balance.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * Method that prints out a string with name, interest rate, and balance.
    * @return output.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
    * Method that verifies if the amount is valid or not.
    * @param amount Inputted double amount that is verfied in method.
    * @return true or false based on if the amount is greated or equal to 0.
    */
   public static boolean isAmountValid(double amount) {
      return (amount >= 0);
   }
   
   /**
    * Method that returns a boolean based on if the customer is in debt.
    * @param loan Inputted BankLoan object that is used to find balance.
    * @return true or false based of if the customer's balance is 0 or not.
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
    * Method that returns the amount of loans created.
    * @return loansCreated.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
    * Method that resets the amount of loans created.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
