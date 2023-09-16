// accesses the Java Library for this file so the scanner stuff actually works
import java.util.Scanner;

//first class in the file needs to be named for the file for anything to start
public class GradeCalculator {

    //this line declares the main method which lets a computer access and use the file
    public static void main(String[] args) {

        //this block gets the grade input from the user
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        double gradePercent = input1.nextDouble();

        //declaring the letter grade variable for the next section
        String gradeLetter;

        //This block translates the input grade to a letter grade
        if (gradePercent >= 92) {
            gradeLetter = "A";
        } else if (gradePercent >= 89) {
            gradeLetter = "A-";
        } else if (gradePercent >= 87) {
            gradeLetter = "B+";
        } else if (gradePercent >= 82) {
            gradeLetter = "B";
        } else if (gradePercent >= 79) {
            gradeLetter = "B-";
        } else if (gradePercent >= 77) {
            gradeLetter = "C+";
        } else if (gradePercent >= 72) {
            gradeLetter = "C";
        } else if (gradePercent >= 69) {
            gradeLetter = "C-";
        } else if (gradePercent >= 67) {
            gradeLetter = "D+";
        } else if (gradePercent >= 60) {
            gradeLetter = "D";
        } else if (gradePercent >= 0) {
            gradeLetter = "F";
        } else {
            gradeLetter = "an invalid input.";
        }

        //this displays the letter grade
        System.out.println("Your letter grade is " + gradeLetter);
    }
}