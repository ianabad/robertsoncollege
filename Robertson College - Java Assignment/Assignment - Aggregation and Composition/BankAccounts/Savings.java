/***************************************************************
 * Name: Savings.java
 * Author: Ian Abad
 * 
 ***************************************************************/

package BankAccounts;

public class Savings extends BankAccount{

	// instance variable for interest rate
	private double intRate;
	
//****************************************************************
	
	//Savings constructor that takes the balance and interest rate
	public Savings(double balance, double intRate) {
		super(balance);
		this.intRate = intRate;
	}
	
	//addInterest method ~ apply interest rate into the balance
	public void addInterest() {
		this.balance += (this.balance * this.intRate);
	}
	
	//display method for the saving account type
	@Override
	public void display() {
		System.out.printf("Savings account balance = $%,.2f%n", this.balance);
	}
	

}
