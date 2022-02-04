/***********************************************************************************
 * SalesPerson.java
 * Ian Abad
 * 
 * This class implements a car dealership salesperson
 * *********************************************************************************/

package cardealership;

public class SalesPerson {
	
	private String name; 
	private double sales = 0.0; // sales to date;
	
	//***************************************************************
	
	public SalesPerson (String name) {
		this.name = name;
	}
	
	//***************************************************************
	
	public String getName() {
		return name;
	}
	
	public double getSales() {
		return sales;
	}

}
