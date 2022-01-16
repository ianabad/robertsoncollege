/*********************************************************
*
* Title: Bank Balance
* Author: Ian Abad
* Date (Or last updated): December 12, 2021
* Details: Write a program that prompts the user for a 
* starting balance and then prints the number of years it 
* takes to reach $100,000 and also the number of years it 
* takes to reach $1,000,000.
*
**********************************************************/

import java.util.*;

public class BankBalance {
    
    public static void main(String[] args) {
        //Scanner Initiation
        Scanner startingBalance = new Scanner(System.in);

        // Variable declaration
        int bankBalance;
        int years = 0;
        int targetBalance = 100_000;

        // Prompt for starting balance
        System.out.print("Enter starting balance: ");
        bankBalance = startingBalance.nextInt();
        
        // 1st while loop to get the years to 100K
        while (bankBalance < targetBalance) {
            years++;
            bankBalance *= 2;
        }

        // Return or print for the years to 100K
        System.out.println("It takes " + years + " years to reach $100,000.");

        // Adjustment of targetBalance variable to new target
        targetBalance = 1_000_000;
        
        // 2nd while loop to get the years to 1M
        while (bankBalance < targetBalance) {
            years++;
            bankBalance *= 2;
        }

        // Return or print for the years to 1M
        System.out.println("It takes " + years + " years to reach $1,000,000.");

        // Close scanner
        startingBalance.close();
    }
}