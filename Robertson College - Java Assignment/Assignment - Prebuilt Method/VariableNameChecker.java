/*
*
* Title: Variable Name Checker
* Author: Ian Abad
* Date: December 18, 2021
* Details: Validates the input if the variable name (Java Standard) is valid. 
* Good style = if uses letters and digits and uses lowercase for first character.
* Poor Style = if 1st letter is capital and uses special character.
* Illegal = if there's space, and if first character is a digit.
*
* Note: This is an Assignment for Robertson College
*
*/

import java.util.*;

public class VariableNameChecker {

    // validate variable whether legal or illegal
    public static boolean legalValidation(String str) {
        char[] chars = str.toCharArray();
        boolean isValid = true;

        //Illegal = Has space or first character is a digit.
        //Otherwise = Variable is legal
        for (char c : chars) { 
            if (Character.isWhitespace(c) || Character.isDigit(chars[0]))  {
                isValid = false;
            }
        }
        return isValid;
    }

    // validate variable's style whether it is good or poor. 
    public static boolean styleValidation(String str) {
        char[] chars = str.toCharArray();
        boolean isValid = true;

        // Poor style = it has special characters or first character is capitalized.
        // Otherwise = Good style
        for (char c : chars) {
            if (Character.isUpperCase(chars[0]) || !Character.isLetterOrDigit(c)) {
                isValid = false;
            }
        }
        return isValid;
    } 
    
    public static void main(String[] args) {
        String variable;
        Scanner input = new Scanner(System.in);
        
        do {
            
            System.out.print("Enter a variable name (q to quit): ");
            variable = input.nextLine();

            // conditional statements for the program
            if (!(variable.equals("Q") || variable.equals("q"))) { // skips if user input is "q" or "Q"
                if (legalValidation(variable)) { // 1st filter to find out whether the variable is legal
                    if(styleValidation(variable)) { // conditional to find out whether the variable has a good style
                        System.out.println("Good!");
                    } else {
                        System.out.println("Legal, but uses poor style.");
                    }
                } else { 
                    System.out.println("Illegal");
                }
            }

        } while (!(variable.equals("Q") || variable.equals("q")));

    input.close(); // closing scan
        
    }
}