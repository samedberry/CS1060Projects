import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        //get initial input
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a starting of string: ");
        String userString = input1.nextLine();

        //menu loop, must enter 7 to exit program
        int choice;
        while (true) {

            //menu dialog
            System.out.println("Pick an option:");
            System.out.println("1. Add content");
            System.out.println("2. Check if string contains substring");
            System.out.println("3. Output length");
            System.out.println("4. Output substring after prefix");
            System.out.println("5. Output substring before suffix");
            System.out.println("6. Output substring between prefix and suffix");
            System.out.println("7. Exit");

            //input handling
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
                showLength(userString);
            } else if (choice == 4) {
                afterSubstring(userString);
            } else if (choice == 5) {
                beforeSubstring(userString);
            } else if (choice == 6) {
                betweenSubstrings(userString);
            } else {
                endProgram();
            }

            System.out.println("Current string: " + userString);
            System.out.println();
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

    public static int showLength(String userString) {
        System.out.println("Selected 3");
        return 5;
    }

    public static void afterSubstring(String userString) {
        System.out.println("Selected 4");
    }

    public static void beforeSubstring(String userString) {
        System.out.println("Selected 5");
    }

    public static void betweenSubstrings(String userString) {
        System.out.println("Selected 6");
    }

    public static void endProgram() {
        System.out.println("Selected 7");
        System.exit(0);
    }
}