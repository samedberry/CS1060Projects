import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        //get initial input
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter values (-1 to stop)");
        int inputNumber = 0;

        int[] numbers = new int[101];
        int counter = 0;
        //loop for input
        while (inputNumber != -1) {
            inputNumber = input1.nextInt();
            if (inputNumber != -1) {
                numbers[counter] = inputNumber;
                counter++;
            }
        }


        System.out.println("Your values, reversed:");
        //loop through reversal array for output
        for (int i = counter - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
