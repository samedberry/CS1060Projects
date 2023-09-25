// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Press Alt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.

// Press Shift+F10 or click the green arrow button in the gutter to run the code.]

// Press Shift+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
