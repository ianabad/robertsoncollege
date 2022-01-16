/******************************************************************************
*
* Title: Economic Policy
* Author: Ian Abad
* Date (or last updated): December 12, 2021
* Details: Write a program that applies these economic policy practices. 
* More specifically, read in growthRate and inflationvalues and 
* output the recommended economic policy for the given economic situation. 
* If there is no recommended economic policy for the given economic situation, 
* then output “No change in economic policy.”
*
*******************************************************************************/

import java.util.*;

public class EconomicPolicy {
    
    public static void main(String[] args) {
        // Variable Declaration
        double growthRate;
        double inflationValue; 

        // Scanned Initation
        Scanner input = new Scanner(System.in);

        // Description of program in print
        System.out.println("Enter the following information for recommended economic policy.");
        
        // First prompt for the annual growth rate
        System.out.print("1. Enter the annual growth rate: ");
        growthRate = input.nextDouble();

        // Second prompt for the inflation rate
        System.out.print("2. Enter the inflation rate: ");
        inflationValue = input.nextDouble();

        // If statements for the program
        if (growthRate < 1) {
            if (inflationValue < 3) {
                System.out.println("\nRecommended economic policy is: \nIncrease welfare spending, reduce personal taxes, and decrease discount rate.\n");
            } else {
                System.out.println("\nRecommended economic policy is: \nReduce business taxes.\n");
            }
        } 
        else if (growthRate > 4) {
            if (inflationValue < 1) {
                System.out.println("\nRecommended economic policy is: \nIncrease personal and business taxes, and decrease discount rate.\n");
            } 
            else if (inflationValue > 3) {
                System.out.println("\nRecommended economic policy is: \nIncrease discount rate.\n");
            }
            else {
                System.out.println("\nNo change in economic policy.\n");
            }
        }
        else {
            System.out.println("\nNo change in economic policy.\n");
        } 
        
        // Closing scanner
        input.close();
    }

}