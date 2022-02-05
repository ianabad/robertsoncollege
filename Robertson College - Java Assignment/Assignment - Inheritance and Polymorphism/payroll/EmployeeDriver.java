/*********************************************************************
 * Title: EmployeeDriver.java
 * Author: Ian Abad
 *********************************************************************/

package payroll;

import java.util.*;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		// Scanner Initialization
		Scanner input = new Scanner(System.in);
		
		// Employee List Initialization
		List<Employee> employees = new ArrayList<>();
		
		// Instance Variable
		int empCount;
		int opt = 0;
		
		/**************************************************************/
		
		// Prompts and main program
		System.out.print("Number of employees: ");
		empCount = input.nextInt();
		
		// For loop for the program. 
			// The program will keep going until it went through the given employee count.
		for(int i = 0; i < empCount; i++) {
			
			System.out.printf("PROFILE FOR EMPLOYEE #%d:%ntype Hourly(1), Salaried(2), Salaried plus Commission(3)%nEnter 1, 2, or 3 ==> ",
					i + 1);
			
			opt = input.nextInt();
			
			// Options for the program
			switch(opt) {
				case 1: 
					Hourly hourly = new Hourly();
					hourly.load(hourly);
					System.out.println();
					employees.add(hourly);
					break;
					
				case 2:
					Salaried salaried = new Salaried();
					salaried.load(salaried);
					System.out.println();
					employees.add(salaried);
					break;
					
				case 3: 
					SalariedPlusCommission salariedPlus = new SalariedPlusCommission();
					salariedPlus.load(salariedPlus);
					System.out.println();
					employees.add(salariedPlus);
					break; 
					
				default:
					System.out.println("ERROR: Invalid entry. Please input a valid entry.");
					i =- 1;
					break;
			}
		}
		
		/**************************************************************/
		
		// For each function to print after inputting the program
		for(Employee employee : employees) {
			System.out.println(employee.toString());
		}
		
		/**************************************************************/
		
		// Closing the scanner
		input.close();
	}

}
