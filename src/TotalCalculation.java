//    Open the “items.txt” file.
//    Read all of the values in a loop. You will need to use “hasNextDouble” for this.
//    Keep a running total of the numbers in the file.
//    Calculate the sub-total,
//    use 5.3% tax to calculate final total.
//    Write sub-total, tax, and final total to the “total.txt” file.
//    Print only two decimal points as these are monetary values.

//Sample Output:
// The sub-total is $72.04
//The tax is $3.82
//The total is $75.86


import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class TotalCalculation {
    public static void main(String[] args) throws Exception {

        System.out.println();

        File file = new File("items.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println();
//        Scanner input1 = new Scanner(fileReader);
//
//        System.out.println(input1.nextDouble());
    }

}
