/*
*
* Title: Phone Number Dissector
* Author: Ian Abad 
* Date: Decemeber 18, 2021
* Details: Implement a program that reads phone numbers, and for each phone number, 
* it displays the phone number’s three components –country code, area code, and local number.
*
* Note: This is an assignment for Robertson College
*/

import java.util.*;

public class PhoneNumberDissector {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phoneNumber;

        // Loop for Q or q function
        do {
            System.out.println("Enter a phone number in the form cc-area-local,where cc = country code digits, area = area code digits,and local = local phone digits.");
            System.out.print("Or enter q to quit: ");
            phoneNumber = input.nextLine(); 

            if (!(phoneNumber.equals("q") || phoneNumber.equals("Q")) && (phoneNumber.length() > 12 && phoneNumber.length() < 14)) {

                String[] arr = phoneNumber.split("-"); 
                if (arr.length == 3) { // confitional if array to find out if the number of array is what we are looking for - which is 3
                    String countryCode = arr[0];
                    String areaCode = arr[1];
                    String localPhoneNumber = arr[2];

                    System.out.println("country code = " + countryCode);
                    System.out.println("area code = " + areaCode);
                    System.out.println("local phone number = " + localPhoneNumber);
                }
            }

        } while (!(phoneNumber.equals("q") || phoneNumber.equals("Q")));

        input.close();
        
    }


}