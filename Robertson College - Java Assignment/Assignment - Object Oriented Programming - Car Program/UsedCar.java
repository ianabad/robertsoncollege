package CarProgram;

/*
 * Title: Used Car Class 
 * Description: A subclass for superclass -- Car.java
 * Author: Ian Abad
 */

public class UsedCar extends Car {
	// Put mileage as double so we could format the mileage with commas
	double mileage; 
	
	// Constructor for Used Car
	public UsedCar(double cost, double mileage) {
		this.setPrice(cost);
		this.mileage = mileage;
	}

	// Display Method for Used Car
	public void display() {
		System.out.println("price = $" + String.format("%1$,.2f",this.getPrice()) + ", mileage = " + String.format("%1$,.0f",this.mileage));
	}

	// Equals Method for Used Car
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof UsedCar) {
			UsedCar usedCar = (UsedCar) obj;
			if ((this.cost == usedCar.cost) && (this.mileage == usedCar.mileage)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

