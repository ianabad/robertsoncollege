package cardealership;

public class DealershipDriver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ryne = new Manager("Ryne Mendez"); 
		SalesPerson nicole = new SalesPerson("Nicole Betz"); 
		SalesPerson vince = new SalesPerson("Vince Sola"); 
		Dealership dealership =
				new Dealership("OK Used Cars", ryne);
		
		dealership.addPerson(nicole);
		dealership.addPerson(vince); 
		
		// Composition relationship ~ creates anonymous object when it instantiates cars 
		// which gives dealership exclusive ownership and complete control over the cars
		dealership.addCar(new Car("GMC")); 
		dealership.addCar(new Car("Yugo")); 
		dealership.addCar(new Car("Dodge")); 
		dealership.printStatus(); 
		
	}

}
