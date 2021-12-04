/***************************************************************
*
* CircleParameter.java
* Author: Ian Abad
* 
* This program calculates and print the circle parameters.
*
****************************************************************/

import java.util.Scanner; // to import the Scanner for user-inputs

public class CircleParameter {
    static Scanner stdIn = new Scanner(System.in); // Inputted outside of the main method due to 'resource leaked' warning
    public static void main(String[] args) {
        // Variable declarations 
        double radius;
        double diameter;
        double circumference;
        double area;

        // First prompt to get use input for radius
        System.out.print("Enter a radius number: ");
        radius = stdIn.nextDouble();

        // Formulas
        diameter = radius * 2;
        circumference = Math.PI * 2 * radius;
        area = Math.PI * (radius * radius);

        // Print - Results
        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }
} // End program
