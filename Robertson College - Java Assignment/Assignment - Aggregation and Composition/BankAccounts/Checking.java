/***************************************************************
 * Name: Checking.java
 * Author: Ian Abad
 * 
 ***************************************************************/

package BankAccounts;

public class Checking extends BankAccount {
	
	//Checking Constructor
	public Checking(double balance) {
		super(balance);
	}
	
	// writeACheck Method ~ withdraws money & deducts $1 as fee
	public void writeACheck(double amt) {
		this.withdrawFilter(amt);
		this.balance -= 1;
		
	}
	
	// display method for checking account type
	@Override
	public void display() {
		System.out.printf("Checking account balance = $%,.2f%n", this.balance);
	}
	
	
}
