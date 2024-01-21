import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        //setup
        String[] words = new String["program", "weather", "garbage", "obviate", "quilted"];
        String word;
        StringBuilder displayWord = new StringBuilder();
        char playAgain = 'y';
        Scanner input1 = new Scanner(System.in);

        //play HangMan
        do {
            System.out.println();

            //pick a random word from []words******************************************
            word = words[0];
            for (int i = 0; i < word.length(); i++) {
                displayWord.append("*");
            }


                //sub loop: while (displayWord.patternCount(*) != 0)
                //display asterisks
                //replace asterisks with correctly guessed letters
                //count wrong guesses as "misses"

                //example dialogue:
                //"(Guess) Enter a letter in word ******* > p"
                //"(Guess) Enter a letter in word p****** > p"
                //"p is already in the word"
                //"(Guess) Enter a letter in word p****** > n"
                //"n is not in the word"
                //...
                //"(Guess) Enter a letter in word progr*m > a"
                //"The word is program. You missed 1 time."

            System.out.print("Do you want to guess another word? Enter y or n> ");
            playAgain = input1.next().charAt(0);
            input1.nextLine();
        } while(playAgain == 'y' || playAgain == 'Y')
    }
}
