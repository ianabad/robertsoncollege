import com.address.*;
import com.person.*;

public class Employee {

	private Person person;
	private Address address;
	
	public Employee(String name, int streetNum, String streetName, String city, String province, String postalCode) {
		this.person = new Person(name);
		this.address = new Address(streetNum, 
				streetName, 
				city, 
				province, 
				postalCode);
	}
	
	public void printEmployeeInfo() {
		System.out.printf("Name: %s%nAddress: %s", 
				this.person.getName(),
				this.address.getFullAddress());
	}

}
