import java.util.Scanner;
/**
 * This program validates credit card numbers
 *
 * Main entry point.
 * <p>
 * Execute:</p>
 * <pre>java CreditCardValidation</pre>
 *
 * @param argsnot used.
 *
 * @author Spencer Medberry, S01027971
 * @version2024-1-20, CSC-1061 Assignment 1, Exercise 1.1
 */
public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your credit card number for validation: ");
        if (input1.hasNextLong()) {
            long cardNumber = input1.nextLong();
        } else {
            System.out.println("This is not a valid card number.");
            return;
        }
        //check that first digit(s) are for valid cc vendor

        //run card check

    }

    /** Get the result from Step 2. */
    public static int sumOfDoubleEvenPlace(long number){
        Long cardNumber = new Long(number);
        String stringNumber = String.valueOf(number);
        int total = 0;
        for (int i = stringNumber.length()-2; i >= 0; i-=2) {


        }
    }

    /** Return this number if it is a single digit. Otherwise, return the sum of the two digits. */
    public static int getDigit(int number){

    }

    /** Return sum of odd-place digits in number. */
    public static int sumOfOddPlace(long number){

    }

    /** Return true if the number d is a prefix for number. */
    public static boolean prefixMatched(long number, int d){

    }

    /** Return the number of digits in d. */
    public static int getSize(long d){

    }

    /** Return the first k number of digits from number.
     * If the number of digits in number is less than k, return number. */
    public static long getPrefix(long number, k){

    }

    /** Return true if the card number is valid. */
    public static boolean isValid(long number){

    }
}
