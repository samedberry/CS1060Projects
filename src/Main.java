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
//        Scanner input1 = new Scanner(System.in);
//        System.out.println("Please enter the radius of your cylinder: ");
//        double radius = input1.nextDouble();
//        System.out.println("Please enter the length of your cylinder: ");
//        double length = input1.nextDouble();
//        double area = area(radius);
//        System.out.println("The area of the base of your cylinder is " + area);
//        double volume = volume(area, length);
//        System.out.println("The volume of your cylinder is " + volume);



    }

/// A = r*r*pi
    public static double area(double radius) {
        double area = radius * radius * Math.PI;
        return (area);
    }

// V = A*l
    public static double volume(double area, double length) {
        double volume = area * length;
        return (volume);
    }

}
