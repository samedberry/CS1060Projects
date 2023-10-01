import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        //get initial input
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a starting of string: ");
        String userString = input1.nextLine();

        //loop variables
        int choice;
        String substring;
        String prefix;
        String suffix;

        //menu loop, must enter 7 to exit program
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
            System.out.println();

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
                substring = input1.nextLine();
                userString = addToString(userString, substring);
                System.out.println();
                System.out.println("Current string: " + userString);
            } else if (choice == 2) {
                substring = input1.nextLine();
                if (checkForSubstring(userString, substring)) {
                    System.out.println(userString + " contains " + substring + ".");
                } else {
                    System.out.println(userString + " does not contain " + substring + ".");
                }
            } else if (choice == 3) {
                System.out.println("Length is: " + showLength(userString));
            } else if (choice == 4) {
                System.out.println("Prefix: ");
                prefix = input1.nextLine();
                System.out.println();
                System.out.println(afterPrefix(userString, prefix));
            } else if (choice == 5) {
                System.out.println("Suffix: ");
                suffix = input1.nextLine();
                System.out.println();
                System.out.println(beforeSuffix(userString, suffix));
            } else if (choice == 6) {
                System.out.println("Prefix: ");
                prefix = input1.nextLine();
                System.out.println("Suffix: ");
                suffix = input1.nextLine();
                System.out.println();
                System.out.println(betweenSubstrings(userString, prefix, suffix));
            } else {
                endProgram();
            }

            System.out.println();
        }
    }

    //all the other methods are menu options
    public static String addToString(String userString, String addString) {
        return userString + addString;
    }

    public static boolean checkForSubstring(String userString, String substring) {
        if (userString.indexOf(substring) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int showLength(String userString) {
        return userString.length();
    }

    public static String afterPrefix(String userString, String prefix) {
        if (checkForSubstring(userString, prefix)) {
            return "Substring: " + userString.substring(userString.indexOf(prefix) + prefix.length());
        } else {
            return userString + " does not contain " + prefix + ".";
        }
    }

    public static String beforeSuffix(String userString, String suffix) {
        if (checkForSubstring(userString, suffix)) {
            return "Substring: " + userString.substring(0, userString.indexOf(suffix));
        } else {
            return userString + " does not contain " + suffix + ".";
        }
    }

    public static String betweenSubstrings(String userString, String prefix, String suffix) {
        if (checkForSubstring(userString, suffix)) {
            if (checkForSubstring(userString, prefix)) {
                return "Substring: " + userString.substring(userString.indexOf(prefix) + prefix.length(), userString.indexOf(suffix));
            } else {
                return userString + " does not contain " + prefix + ".";
            }
        } else {
            return userString + " does not contain " + suffix + ".";
        }
    }

    public static void endProgram() {
        System.out.println("Selected 7");
        System.exit(0);
    }
}