/***************************************************************
 * Name: BankAccount.java
 * Author: Ian Abad
 * 
 ***************************************************************/

package BankAccounts;

public abstract class BankAccount {
	
	// Instance variable
	protected double balance;
	
//***************************************************************
	
	// BankAccount Constructor w/ conditional to limit 
	// any initial balance that are less than zero.
	public BankAccount (double balance) {
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}
	
//***************************************************************
	
	// Deposit Method ~ adds deposits to balance
	public void deposit(double deposit) {
		this.balance = this.balance + deposit;
	}
	
	// Withdraw Method ~ withdraws from balance
	public void withdraw(double withdraw) {
		this.withdrawFilter(withdraw);
	}
	
	/* WithdrawFilter Method
	 * ~ if the withdrawal will cause the balance to go negative, 
	 * ~ the balance will default to zero. 
	 * ~ Otherwise, it will withdraw from account.*/
	public void withdrawFilter(double amt) {
		if ((this.balance - amt) < 0) {
			this.balance = 0;
		} else {
			this.balance -= amt;
		}
	}
	
//***************************************************************
	
	// Abtract display method
	public abstract void display();

} // end of BankAccount.java
