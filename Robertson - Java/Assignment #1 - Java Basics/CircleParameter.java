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
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 

        // Variable declarations 
        double radius;
        double diameter;
        double circumference;
        double area;

        // First prompt to get use input for radius
        System.out.print("Enter a radius number: ");
        radius = scan.nextDouble();

        // Formulas
        diameter = radius * 2;
        circumference = Math.PI * 2 * radius;
        area = Math.PI * (radius * radius);

        // Print - Results
        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);

        scan.close(); // to close the scan 
    }
} // End program
