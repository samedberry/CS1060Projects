import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        //get initial input
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = input1.nextLine();


        //menu loop, must enter 7 to exit program
        while (true) {

            //menu dialog
            System.out.println("Please select what would you like to do with your string: ");
            System.out.println("  Enter 1 to add more content to your string.");
            System.out.println("  Enter 2 to check for a substring.");
            System.out.println("  Enter 3 to output the length of your string.");
            System.out.println("  Enter 4 to output the content of your string after a substring.");
            System.out.println("  Enter 5 to output the content of your string up to a substring.");
            System.out.println("  Enter 6 to output the content of your string between one substring and another.");
            System.out.println("  Enter 7 to do nothing and exit the program.");

            //input handling
            int choice;
            if (input1.hasNextInt()) {
                choice = input1.nextInt();
                input1.nextLine();
            } else {
                System.out.println("Invalid choice.");
                continue;
            }

            if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice.");
                continue;
            }


            //selection tree
            if (choice == 1) {
                addToString(userString);
            } else if (choice == 2) {
                checkForSubstring(userString);
            } else if (choice == 3) {
                getLength(userString);
            } else if (choice == 4) {
                afterSubstring(userString);
            } else if (choice == 5) {
                beforeSubstring(userString);
            } else if (choice == 6) {
                betweenSubstring(userString);
            } else {
                endProgram();
            }
        }
    }

    //all the other methods are menu options
    public static String addToString(String userString) {
        System.out.println("Selected 1");
        return userString;
    }

    public static boolean checkForSubstring(String userString) {
        System.out.println("Selected 2");
        return true;
    }

    public static int getLength(String userString) {
        System.out.println("Selected 3");
        return 5;
    }

    public static void afterSubstring(String userString) {
        System.out.println("Selected 4");
    }

    public static void beforeSubstring(String userString) {
        System.out.println("Selected 5");
    }

    public static void betweenSubstring(String userString) {
        System.out.println("Selected 6");
    }

    public static void endProgram() {
        System.out.println("Selected 7");
        System.exit(0);
    }
}