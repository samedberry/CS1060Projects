import java.util.Scanner;

/**
 * This program lets you play HangMan
 *
 * <p>
 * Main entry point.
 * <p>
 * Execute:</p>
 * <pre>java HangMan</pre>
 *
 * @param argsnot used.
 * @author Spencer Medberry, S01027971
 * @version2024-1-21, CSC-1061 Assignment 1, Exercise 1.2
 */
public class HangMan {
    static Scanner input1 = new Scanner(System.in);

    public static void main(String[] args) {
        //setup
        String[] words = new String[]{"program", "weather", "garbage", "obviate", "quilted"};
        char playAgain = 'y';

        do {
            playHangMan(words);
            System.out.print("Do you want to guess another word? Enter y or n> ");
            playAgain = input1.next().charAt(0);
            input1.nextLine();
        } while (playAgain == 'y' || playAgain == 'Y');
    }

    /**
     * HangMan guessing game
     */
    public static void playHangMan(String[] words) {
        //setup
        System.out.println();
        int misses = 0;
        String guess = " ";
        //random word
        String word = words[(int) (Math.random() * words.length)];
        StringBuilder displayWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            displayWord.append("*");
        }

        //guess loop
        do {
            System.out.print("(Guess) Enter a letter in word " + displayWord + " > ");
            guess = input1.nextLine().substring(0, 1);

            if (displayWord.indexOf(guess) > -1) {
                System.out.println("\t" + guess + " is already in the word.");
            } else if (word.indexOf(guess) > -1) {
                for (int i = 0; i < word.length(); i++)
                    if (word.charAt(i) == guess.charAt(0)) {
                        displayWord.setCharAt(i, guess.charAt(0));
                    }
            } else {
                misses = misses + 1;
                System.out.println("\t" + guess + " is not in the word.");
            }

        } while (displayWord.indexOf("*") != -1);

        //ending dialog
        if (misses == 1) {
            System.out.println("The word is " + word + ". You missed " + misses + " time.");
        } else {
            System.out.println("The word is " + word + ". You missed " + misses + " times.");
        }
    }
}
