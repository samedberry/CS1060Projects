// accesses the Java Library for this file so the scanner stuff actually works
import java.util.Scanner;

//first class in the file needs to be named for the file for anything to start
public class CircleCalculation {

    //this line declares the main method which lets a computer access and use the file
    public static void main(String[] args) {

        //this block gets the radius of a circle input from the user
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        double radius = input1.nextDouble();

        //this displays the diameter of the circle
        double diameter = diameter(radius);
        System.out.println("The diameter of your circle is " + diameter);

        //this displays the area of the circle
        double area = area(radius);
        System.out.println("The area of your circle is " + area);

        //this displays the circumference of the circle
        double circumference = circumference(radius);
        System.out.println("The circumference of your circle is " + circumference);
    }

    //This calculates the diameter
    public static double diameter(double radius){
        double diameter = radius * 2;
        return (diameter);
    }

    //This calculates the area
    public static double area(double radius){
        double area = radius * radius * Math.PI;
        return (area);
    }

    //This calculates the circumference
    public static double circumference(double radius){
        double circumference = radius * 2 * Math.PI;
        return (circumference);
    }

}
