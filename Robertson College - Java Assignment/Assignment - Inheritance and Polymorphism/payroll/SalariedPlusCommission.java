/*********************************************************************
 * Title: SalariedPlusCommission.java
 * Author: Ian Abad
 *********************************************************************/

package payroll;

public class SalariedPlusCommission extends Salaried{
	
	// Instance variable 
	private double salesPastWeek;
	private double comRate;
	
	/****************************************************************/
	
	// Modified load method for salaried + commission employee.
			// Takes in weekly salary + commission in addition to the based info.
	public void load (Salaried salary) {
		salary.load(salary);
		System.out.print("Sales for this past week ==> ");
		this.salesPastWeek = input.nextDouble();
		
		System.out.print("Sales commission rate (fraction paid to employee) ==> ");
		this.comRate = input.nextDouble();
		
		input.nextLine();
		
	}
	
	// Get earnings information for salaried + commission employee.
	public double getEarnings() {
		this.setPaycheck((weeklySalary + (salesPastWeek * comRate)) + this.getBonus());
		return this.paycheckLimit(this.getPaycheck());
	}
	
}
