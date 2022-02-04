/* ***************************************************************************
 * Title: SavingAccountDriver.java
 * Author: Ian Abad
 * 
 * Note: a program that establishes two savings accounts with saver1 
 * having account number 10002 with an initial balance of $2,000, and saver2 
 * having account 10003 with an initial balance of $3,000. Set a common rate 
 * of interest at 5% per year. At the end of each month, update the balance 
 * by adding one month’s interest to the balance, so that the balance 
 * compounds monthly.
 * 
 ****************************************************************************/

package SavingsAccountComparison;

public class SavingAccountDriver {

	public static void main(String[] args) {
		
		// Instantiating the objects
		SavingAccount saver1 = new SavingAccount(10002, 2000.00); 
		SavingAccount saver2 = new SavingAccount(10003, 3000.00);
		
		// setting annual interest
		SavingAccount.setAnnualInterestRate(0.05); 
		
		// adding monthly interest
		saver1.addMonthlyInterest(); 
		saver2.addMonthlyInterest();
		
		// printing statement
		saver1.printStatement(saver2);
		
	}

}
