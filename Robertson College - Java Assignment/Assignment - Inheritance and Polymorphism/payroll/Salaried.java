/*********************************************************************
 * Title: Salaried.java
 * Author: Ian Abad
 *********************************************************************/

package payroll;

public class Salaried extends Employee{
	
	// Instance variable
	protected double weeklySalary; 
	
	/****************************************************************/
	
	// Modified load method for salaried employee.
		// Takes in weekly salary in addition to the based info. 
	public void load(Employee employee) {
		employee.load();
		System.out.print("Salary ==> ");
		this.weeklySalary = input.nextDouble();
		
		input.nextLine();
		
	}
	
	/****************************************************************/
	
	// Get earnings information for salaried employee.
	public double getEarnings() {
		this.setPaycheck(weeklySalary + this.getBonus());
		return this.paycheckLimit(this.getPaycheck());
	}


}
