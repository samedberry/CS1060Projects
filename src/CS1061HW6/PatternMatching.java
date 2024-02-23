package CS1061HW6;

import java.util.Scanner;

public class PatternMatching {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        char a;
        char b;

        System.out.println("Enter a string s1:");
        String s1 = input1.nextLine();
        System.out.println("Enter a string s2:");
        String s2 = input1.nextLine();

        boolean match;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            match = true;
            for (int i2 = 0; i2 < s2.length(); i2++) {
                a = s1.charAt(i + i2);
                b = s2.charAt(i2);
                if (a != b) {
                    match = false;
                    i = i + i2;
                    break;
                }
            }
            if (match == true) {
                System.out.println("matched at index " + i);
                return;
            }
        }


        System.out.println("s2 did not match s1.");
    }
}
