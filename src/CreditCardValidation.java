import java.util.Scanner;

/**
 * This program validates credit card numbers
 *
 * <p>
 * Main entry point.
 * <p>
 * Execute:</p>
 * <pre>java CreditCardValidation</pre>
 *
 * @param argsnot used.
 * @author Spencer Medberry, S01027971
 * @version2024-1-20, CSC-1061 Assignment 1, Exercise 1.1
 */
public class CreditCardValidation {
    public static void main(String[] args) {
        long cardNumber;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your credit card number for validation: ");
        if (input1.hasNextLong()) {
            cardNumber = input1.nextLong();
        } else {
            System.out.println("This is not a valid card number.");
            return;
        }

        if (isValid(cardNumber)) {
            System.out.println("This is a valid card number.");
        } else {
            System.out.println("This is not a valid card number.");
        }

    }

    /**
     * Return true if the card number is valid.
     */
    public static boolean isValid(long number) {
        //A credit card number must have between 13 and 16 digits.
        if (getSize(number) < 13 || getSize(number) > 16) return false;

        /*check that first digit(s) are for valid cc vendor
        Must start with:
            4 for Visa cards
            5 for Master cards
            6 for Discover cards
            37 for American Express cards
         */
        if (
                !prefixMatched(getPrefix(number, 1), 4) &&
                        !prefixMatched(getPrefix(number, 1), 5) &&
                        !prefixMatched(getPrefix(number, 1), 6) &&
                        !prefixMatched(getPrefix(number, 2), 37)
        ) return false;

        //mod 10 check
        if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0) return false;

        return true;
    }

    /**
     * Get the result from Step 2.
     */
    public static int sumOfDoubleEvenPlace(long number) {
        String stringNumber = String.valueOf(number);
        int sumElement = 0;
        int total = 0;
        for (int i = stringNumber.length() - 2; i >= 0; i -= 2) {
            sumElement = getDigit(2 * Character.getNumericValue(stringNumber.charAt(i)));
            total = total + sumElement;
        }
        return total;
    }

    /**
     * Return this number if it is a single digit. Otherwise, return the sum of the two digits.
     */
    public static int getDigit(int number) {
        if (number / 10 == 0) {
            return number;
        } else {
            return (number / 10) + (number % 10);
        }
    }

    /**
     * Return sum of odd-place digits in number.
     */
    public static int sumOfOddPlace(long number) {
        String stringNumber = String.valueOf(number);
        int total = 0;
        for (int i = stringNumber.length() - 1; i >= 0; i -= 2) {
            total = total + Character.getNumericValue(stringNumber.charAt(i));
        }
        return total;
    }

    /**
     * Return true if the number d is a prefix for number.
     */
    public static boolean prefixMatched(long number, int d) {
        String stringNumber = String.valueOf(number);
        String stringD = String.valueOf(d);
        return stringNumber.indexOf(stringD) == 0;
    }

    /**
     * Return the number of digits in d.
     */
    public static int getSize(long d) {
        String stringD = String.valueOf(d);
        return stringD.length();
    }

    /**
     * Return the first k number of digits from number.
     * If the number of digits in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        String stringNumber = String.valueOf(number);
        if (stringNumber.length() > k) {
            return Long.valueOf(stringNumber.substring(0, k));
        } else {
            return number;
        }
    }
}
