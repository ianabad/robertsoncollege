/***********************************************************************************
 * Dealership.java
 * Ian Abad
 * 
 * This represents an auto retail sales organization.
 * *********************************************************************************/

package cardealership;

import java.util.*;

public class Dealership {
	
	// Containership implemented here
	// Declaring COMPONENTS of COMPOSITE/CONTAINING CLASS (DEALERSHIP)
	
		// one to one association
		private String company;
		private Manager manager; 
		
		// one to many association
		private ArrayList<SalesPerson> people = new ArrayList<>();
		private ArrayList<Car> cars = new ArrayList<>();
		
	//********************************************************************************
	
	public Dealership(String company, Manager manager) {
		this.company = company; 
		this.manager = manager;
	}
	
	//********************************************************************************
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void addPerson(SalesPerson person) {
		people.add(person);
	}
	
	//********************************************************************************
	
	public void printStatus() {
		System.out.println(company + "\t" + manager.getName());
		for (SalesPerson person : people) {
			System.out.println(person.getName());
			System.out.println(person.getSales());
		}
		for (Car car : cars) {
			System.out.println(car.getMake());
		}
	} // End of Print Status
	
}// End of Dealership Class
