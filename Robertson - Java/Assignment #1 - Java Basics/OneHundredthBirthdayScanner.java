/*****************************************************************
*
* OneHundredthBirthday.java
* Author: Ian Abad
* 
* This program calculates and print the 100th birthday of someone.
* Scanner version
*
******************************************************************/

import java.util.Scanner; // to import the Scanner for user-inputs

public class OneHundredthBirthdayScanner {
    static Scanner stdIn = new Scanner(System.in); // Inputted outside of the main method due to 'resource leaked' warning
    public static void main(String[] args) {

        // Variable Declaration
        String birthdayMonth;
        int birthdayDay;
        int birthdayYear; 
        String oneHundredthBirthday; // Variable dedicated for the calculated date

        // Prompts
        System.out.print("Enter the month you were born: ");
        birthdayMonth = stdIn.next();
        System.out.print("Enter the day you were born: ");
        birthdayDay =  stdIn.nextInt();
        System.out.print("Enter the day you were born: ");
        birthdayYear = stdIn.nextInt();

        // Calculation for 100th Birthday
        oneHundredthBirthday = birthdayMonth + " " + birthdayDay + ", " + (birthdayYear + 100);

        //Prompt results 
        System.out.print("You will be 100 on " + oneHundredthBirthday);
    }

} // End Program
