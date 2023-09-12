/*
Write a program that will:
    read in the radius of a circle
    print out the diameter, circumference, and area.

Use a separate function for doing each calculation
Use parameters and return values to pass information

The formulas are given below:
    radius(r)
    diameter(d) = 2*r
    area(A) = pi * r^2
    circumference(C) = 2 * pi * r

Details
    Write the functions to do each calculation.
    Test that each one works.
    Write main to ask the user to enter the radius, then call each function, and print the results.
    pi is available in Java as Math.PI
 */


import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your radius: ");
        double radius = input1.nextDouble();

    }
}
