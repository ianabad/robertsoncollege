package employeeInfo;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Bob the Builder");
		employee1.setEmployeeAddress(123, "Home Street", "Winterpeg", "MB", "R3G9B1");
		employee1.printEmployeeInfo();
	}

}
