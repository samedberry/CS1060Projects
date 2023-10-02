import java.util.Scanner;

/*
Write a program that:
 reads in a number of positive integers from the user,
 stores them in an array,
 prints them out in the reverse order.
The user will enter the numbers one on each line and will use -1 to mark the end.
The user will never enter more than 100 numbers.

You should create an array to hold the numbers.
You should read in the numbers using a Scanner inside of a loop.
You should stop the loop when the user enters a value of -1.
You should loop through the array backwards printing each value.
Do not print the -1 value or any unused areas of the array.
 */

/*
Example Run

Enter values (-1 to stop)
: 10
: 20
: 30
: 40
: 50
: 60
: -1
Your values, reversed:
60
50
40
30
20
10
 */

public class ArrayReversal {
    public static void main(String[] args) {
        //get initial input
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input goes here: ");
        String userString = input1.nextLine();
    }
}
