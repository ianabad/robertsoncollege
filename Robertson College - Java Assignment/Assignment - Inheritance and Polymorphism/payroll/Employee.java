/*********************************************************************
 * Title: Employee.java
 * Author: Ian Abad
 *********************************************************************/

package payroll;

import java.util.*;

public abstract class Employee {
	
	// Instance variable
	private String name;
	private String SSN;
	private int birthdayMonth;
	private int birthdayWeek;
	protected double paycheck;
	
	// Scanner
	public static Scanner input = new Scanner(System.in);
	
	/****************************************************************/
	
	// Default constructor
	public Employee() {}
	
	/****************************************************************/
	
	// Abstract methods
	abstract public double getEarnings();
	
	/****************************************************************/
	
	// Load method ~ Base prompts/setter for basic information that applies to all types.
		// This will be the foundation for each of the load methods in the children classes. 
	public void load() {
		System.out.print("Name ==> ");
		this.name = input.nextLine();
		
		System.out.print("Social security number ==> ");
		this.SSN = input.next();
		
		System.out.print("Birthday month (1-12) ==> ");
		this.birthdayMonth = input.nextInt();
			// Conditional to get the valid amount
			if(!(this.birthdayMonth > 0) || !(this.birthdayMonth < 13)) {
				System.out.println("Input Invalid. Please put valid number");
				System.out.print("Birthday month (1-12) ==> ");
				this.birthdayMonth = input.nextInt();
			}
		
		System.out.print("Birthday bonus week (1-4) ==> ");
		this.birthdayWeek = input.nextInt();
			// Conditional to get the valid amount
			if(!(this.birthdayWeek > 0) && !(this.birthdayWeek < 5)) {
				System.out.println("Input Invalid. Please put valid number");
				System.out.print("Birthday bonus week (1-4) ==> ");
				this.birthdayWeek = input.nextInt();
			}
	}
	
	// Overridden toString method which gives values to print when the program is finished.
	@Override
	public String toString() {
		return String.format("employee: %s %nsocial security number: %s %npaycheck: $%,.2f%n",
				this.name,
				this.SSN,
				this.getEarnings());
	} 
	
	// paycheckLimit ~ this limits that paycheck to a maximum of 1000. 
	public double paycheckLimit(double paycheck) {
		if(paycheck > 1000) {
			return 1000.00;
		}
		return paycheck;
	}
	
	/****************************************************************/
	
	//Getters
	
	// Determines if the employee is eligible for a bonus.
	public double getBonus() {
		Calendar today = Calendar.getInstance();
		if((this.birthdayWeek == today.get(Calendar.WEEK_OF_MONTH)) && ((today.get(Calendar.MONTH)+1) == birthdayMonth)) {
			return(100.00);
		}
		return (0.00);
}

	public String getName() {
		return name;
	}

	public String getSSN() {
		return SSN;
	}
	
	public int getBirthdayMonth() {
		return birthdayMonth;
	}

	public int getBirthdayWeek() {
		return birthdayWeek;
	}

	public double getPaycheck() {
		return paycheck;
	}

	/****************************************************************/
	
	// Setters
	
	public void setPaycheck(double paycheck) {
		this.paycheck = paycheck;
	}
	
	
}
