public class Person {
	// variable
	private String first;
	private String last;
	public static int numOfPeople;
	
	public Person() {
		this.first = "John";
		this.last ="Doe";
		numOfPeople++;
	}
	
	public Person(String first, String last) {
		this.first = first;
		this.last = last;
		numOfPeople++;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public void setLast(String last) {
		this.last = last;
	}
	
	public void printFullName() {
		System.out.println(this.first + " " + this.last);
	}
	
	public static int getNumOfPeople() {
		return numOfPeople;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Person person1 = new Person();
		  person1.printFullName();
		  Person person2 = new Person("Matt", "Thebo");
		  person2.printFullName();
		  person1.setFirst("Paul");
		  person1.setLast("John");
		  person1.printFullName();
		  System.out.println("Total number of people = " +
				  Person.getNumOfPeople());
	}

}
