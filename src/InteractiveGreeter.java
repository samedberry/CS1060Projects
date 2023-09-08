// accesses the Java Library for this file so the scanner stuff actually works
import java.util.Scanner;

//first class in the file needs to be named for the file for anything to start
public class InteractiveGreeter {

//this line declares the main method which lets a computer access and use the file
public static void main(String[] args) {

    //initialize scanner
    Scanner input1 = new Scanner(System.in);


    //get user name
    System.out.println("What is your name?");
    String name = input1.nextLine();

    //get where user is from
    System.out.println("Where are you from?");
    String locationOfOrigin = input1.nextLine();

    //get user age
    System.out.println("How old are you?");
    int age = input1.nextInt();

    //display greeting with name, age, and where from
    System.out.println("Hello, " + name + " from " + locationOfOrigin + ". You are " + age + " years old.");


    //clear input1 so nextLine doesn't grab the newline character leftover after the prior nextInt
    input1.nextLine();
    //get user hobby
    System.out.println("What's something you like to do?");
    String hobby = input1.nextLine();

    //display well wishing about hobby
    System.out.println("Have fun the next time you " + hobby + ".");


    //get donation amount
    System.out.println("How much would you like to donate today?");
    double donation = input1.nextDouble();

    //display thanks for donation
    System.out.printf("Thank you for your donation of $%.2f.", donation);

    //clear input1 so nextLine doesn't grab the newline character leftover after the prior nextDouble
    //future-proofing in case more inputs are added later
    input1.nextLine();
}
}
