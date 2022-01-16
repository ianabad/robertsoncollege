package CarProgram;

/*
 * Title: New Car Class
 * Author: Ian Abad
 * Description: Subclass for Superclass -- Car.java
 */

public class NewCar extends Car { 
	String color;
	
	// Constructor for NewCar
	public NewCar(double cost, String color) {
		this.setPrice(cost);
		this.color = color;
	}
	
	// Display for NewCar
	public void display () {
		System.out.println("price = $" + String.format("%1$,.2f",this.getPrice()) + ", color = " + this.color);
	}
	
	// Equal Method for NewCar
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof NewCar) {
			NewCar newCar = (NewCar) obj;
			if ((this.cost == newCar.cost) && (this.color == newCar.color)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
