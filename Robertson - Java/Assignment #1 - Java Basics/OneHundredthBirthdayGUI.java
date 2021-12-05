/*****************************************************************
*
* OneHundredthBirthday.java
* Author: Ian Abad
* 
* This program calculates and print the 100th birthday of someone.
* GUI -JOptionPane Version
*
******************************************************************/

import javax.swing.JOptionPane; // to import the user input using GUI

public class OneHundredthBirthdayGUI {
    public static void main(String[] args) {

        // Variable Declaration
        String birthdayMonth;
        int birthdayDay;
        int birthdayYear;
        String oneHundredthBirthday;

        // Prompts
        birthdayMonth = JOptionPane.showInputDialog("Enter the month you were born:");
        birthdayDay =  Integer.parseInt(JOptionPane.showInputDialog("Enter the day your were born:"));
        birthdayYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the day your were born:"));

        // Calculation for 100th Birthday
        oneHundredthBirthday = birthdayMonth + " " + birthdayDay + " " + (birthdayYear + 100);

        //Prompt results 
        JOptionPane.showMessageDialog(null, "You will be 100 on " + oneHundredthBirthday);
    }

} // End Program
