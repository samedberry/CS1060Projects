// Press Alt+Enter with your caret at the highlighted text to see how IntelliJ IDEA suggests fixing it.
// You can add breakpoints for debugging by pressing Ctrl+F8.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //get initial input
        Scanner input1 = new Scanner(System.in);
        System.out.println("Provide user input:");
        int inputNumber = 0;



    }

    public static void bananas(String[] args) {
        String fruit = "banana";
        int index = fruit.indexOf('a'); // returns 1
        System.out.println(index);
        System.out.println();

        index = fruit.indexOf('a', 2); // returns 3
        System.out.println(index);
        System.out.println();

        System.out.println(fruit.substring(0, 3)); //returns "ban"
        System.out.println(fruit.substring(2, 5)); //returns "nan"
        System.out.println(fruit.substring(6, 6)); //returns ""
        System.out.println();

        System.out.println(fruit.substring(0, 6));

        if("five".equals("five")){
        }
    }
}
