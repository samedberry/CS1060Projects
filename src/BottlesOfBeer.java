// accesses the Java Library for this file so the scanner stuff actually works
import java.util.Scanner;

//first class in the file needs to be named for the file for anything to start
public class BottlesOfBeer {

    //this line declares the main method which lets a computer access and use the file
    public static void main(String[] args) {

        //this block gets the number of bottles of beer input from the user
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the number of bottles to start with: ");
        int bottlesInitial = input1.nextInt();

        //start singing from input number of bottles and loop decrementally
        for (int bottles = bottlesInitial; bottles > 2; bottles--){
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (bottles-1) + " bottles of beer on the wall.");
            System.out.println();
        }

        //finish the song with correct english
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer.");
        System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.");
        System.out.println();
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
        System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.");
        System.out.println();
        System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");

        //callback to how many you started with
        System.out.println("Go to the store and buy some more, " + bottlesInitial + " bottles of beer on the wall.");
        System.out.println();
    }
}
