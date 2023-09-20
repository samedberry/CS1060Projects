// accesses the Java Library for this file so the scanner stuff actually works
import java.util.Scanner;

//first class in the file needs to be named for the file for anything to start
public class Triangles {

    //this line declares the main method which lets a computer access and use the file
    public static void main(String[] args) {

        //loops core functionality until user does something other than opt to continue
        char confirm = 'Y';
        while (confirm == 'Y' || confirm == 'y'){

            //get size of 1-50 for triangle from user
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter size: ");
            int size = input1.nextInt();
            if (size < 1 || size > 50){
                System.out.println("Size must be between 1-50!");
                continue;
            }

            //get fill char from user
            System.out.print("Enter fill: ");
            char fill = input1.next( ).charAt(0);

            //print triangle
            for (int counter1 = 1; counter1 <= size; counter1++){
                for (int counter2 = 1; counter2 <= size-counter1; counter2++){
                    System.out.print(" ");
                }
                for (int counter2 = 1; counter2 <= counter1; counter2++){
                    System.out.print(fill + " ");
                }
                System.out.println();
            }

            //allows use to opt out of loop
            System.out.println("Would you like another triangle (Y/N)? ");
            confirm = input1.next( ).charAt(0);
        }
    }
}
