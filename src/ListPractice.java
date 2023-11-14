import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Small hint: `new ArrayList<>();` is your friend.

Create a function "reverseList" that does the same thing as the homework assignment "Array Reversal - Array Traversal".

Create a function "stringToList" that does the same thing as the Exam 2 question. Reproduced below:
        Write a method stringToArray that takes a string argument and returns an array of char where each element of the array is the characters of the string in order. The array should be sized to exactly the length of the string.
        Examples:
        stringToArray("Ham") -> ['H', 'a', 'm']

Create a function "createListWithBounds" that does the same thing as the Exam 2 question. Reproduced below:
    Write a method named generateArrayWithBounds that takes three integer arguments, start, end, and step and returns an array of integers. Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, stepping step numbers in between each number, so start=5, end=10, and step=1 yields [5, 6, 7, 8, 9], but with the same start and end but with step=2 would yield [5, 7, 9}. You can assume the end number will always be greater than or equal to the start number. If step would skip the end number, then do not include it. Note that a length-0 array is valid.
    Examples:
    generateArrayWithBounds(5, 10, 1) → [5, 6, 7, 8, 9]
    generateArrayWithBounds(11, 18, 3) → [11, 14, 17]
    generateArrayWithBounds(1, 2, 1000) → [1]

Create a function "findAndDestroyAllAmoebas" that takes a List of strings and returns the same list with all strings containing "amoeba" (case-insensitive) removed. I repeat: do not create another list.
 */

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

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
