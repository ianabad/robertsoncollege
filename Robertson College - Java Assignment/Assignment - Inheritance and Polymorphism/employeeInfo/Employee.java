package employeeInfo;

public class Employee extends Person {
	private Address address;
	
	public Employee(String name) {
		super(name);
	}
	
	public void setEmployeeAddress(int streetNum, 
			String streetName,
			String city,
			String province,
			String postalCode) {
		this.address = new Address(streetNum, streetName, city, province, postalCode);
	}
	
	public void printEmployeeInfo() {
		System.out.printf("Name: %s%nAddress: %s", 
				this.getName(),
				this.address.getFullAddress());
	}
	
}
