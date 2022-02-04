/* ***************************************************************************
 * Title: SavingAccount.java
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

public class SavingAccount {

// Class Variables
	private static double annualInterestRate;
	private static int lastBalance = 13 - 1;

// Constant Variable
	private final int ACCOUNT_NUMBER;
	
// Instance Variable
	private double balance; 
	private double[] compounded; // array for the compounded interest

//****************************************************************************
	
	// SavingAccount Constructor	
	public SavingAccount(int accNum, double balance) {
		ACCOUNT_NUMBER = accNum;
		this.balance = balance;
		this.compounded = new double[13]; // length of the array
	}

//*****************************************************************************
	
	// addMonthly Interest Method which compounds the interest via Array
	public void addMonthlyInterest(){
		this.compounded[0] = balance;
		for (int i = 1; i < compounded.length; i++) {
			int j = i - 1;
			compounded[i] = compounded[j] + (compounded[j] * (annualInterestRate/12));
		}
	}

//*****************************************************************************

	//Setters
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate;
	}

	//Getters
	public double getArrayLength() {
		return this.compounded.length;
	}
	
	public double getCompBalance(int i) {
		return this.compounded[i];
	}

	public int getAccnum() {
		return ACCOUNT_NUMBER;
	}
	
//*****************************************************************************
	
	//Print Method for the Statement 
	public void printStatement(SavingAccount saveAcc) {		
		
		double finalBalance = this.getCompBalance(lastBalance) + saveAcc.getCompBalance(lastBalance);
		
		System.out.println("Monthly balances for one year with 0.05 annual interest:");
		System.out.println();
		System.out.println("Month   Account #   Balance   Account #    Balance");
		System.out.println("-----   ---------   -------   ---------    -------");
		
		for (int i = 0; i < this.getArrayLength(); i++) {
			System.out.printf("   %2d       %d   $%,.2f       %d    %.2f%n",
					i,
					this.getAccnum(),
					this.getCompBalance(i),
					saveAcc.getAccnum(),
					saveAcc.getCompBalance(i));
		}
		
		System.out.printf("%nFinal balance of both accounts combined: %.2f", finalBalance);
	}


} // End Class
