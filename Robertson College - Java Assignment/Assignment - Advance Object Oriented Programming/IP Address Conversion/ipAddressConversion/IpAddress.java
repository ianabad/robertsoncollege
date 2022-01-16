package ipAddressConversion;

public class IpAddress {
private String dottedDecimal;
private String firstOctet;
private String secondOctet;
private String thirdOctet; 
private String fourthOctet;
private String invalid = "Invalid Entry";

public IpAddress (String dottedDecimal) {
	this.dottedDecimal = dottedDecimal;
}

public String getDottedDecimal () {
	return this.dottedDecimal;
}

public String getOctet(int arrayNumber) {
	String[] arr = this.dottedDecimal.split("\\.");
	this.firstOctet = arr[0];
	this.secondOctet = arr[1];
	this.thirdOctet = arr[2];
	this.fourthOctet = arr[3];
	
	// Conditional to call the appropriate octet variable
	if (arrayNumber > 0 && arrayNumber < 5) {
		if(arrayNumber == 1) {
			return this.firstOctet;
		}
		else if (arrayNumber == 2) {
			return this.secondOctet;
		}
		else if (arrayNumber == 3) {
			return this.thirdOctet;
		} 
		else if (arrayNumber == 4) {
			return this.fourthOctet;
		} 
	
	}
	
	//returns as "Invalid Entry" if it does not meet the criteria in driver class
	return invalid; 
}

}
