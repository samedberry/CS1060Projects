// accesses the Java Library for this file so the scanner stuff actually works
import java.util.Scanner;

//first class in the file needs to be named for the file for anything to start
public class TemperatureConversion {

    //this line declares the main method which lets a computer access and use the file
    public static void main(String[] args) {

        //these lines user input, as long as that input is a number (technically as long as it begins with a number)
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit: ");
        double tempF = input.nextDouble();

        //convert tempF from Fahrenheit to Celsius
        double tempC = (tempF - 32)*5/9;
        //convert tempF from Fahrenheit to Kelvin
        double tempK = ((tempF - 32)*5/9)+273.15;

        // displays results in plain English sentence
        System.out.println(tempF + " degrees Fahrenheit is " + tempC + " degrees Celsius and " + tempK + " degrees Kelvin.");

    }
}