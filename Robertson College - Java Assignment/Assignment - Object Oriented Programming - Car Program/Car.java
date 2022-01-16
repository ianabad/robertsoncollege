package CarProgram;

/*
 * Title: Car Class 
 * Description: superclass for the car program
 * Author: Ian Abad
 */

public class Car {
	private double price;
	double cost;
	
	// Getters for Car Program
	public double getPrice() {
		return this.price;
	}
	
	// Setters for Car Program
	public void setPrice(double cost) {
		this.cost = cost;
		this.price = cost * 2;
	}

}
