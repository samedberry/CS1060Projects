import java.util.Scanner;

/*
Sample Run:
Please enter your grade: 87.5
Your grade is B+.
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your percentage grade: ");
        double gradePercent = input1.nextDouble();

/*
Use if and else if statements to check each condition for the user’s grade.
For each one, output the letter grade corresponding to the numeric grade.
If the grade entered is less than 0, print an error message.

the ranges are listed on the syllabus as:
    [92, ∞): A
    [89, 92): A-
    [87, 89): B+
    [82, 87): B
    [79, 82): B-
    [77, 79): C+
    [72, 77): C
    [69, 72): C-
    [67, 69): D+
    [60, 67): D
    [0, 60): F
*/

        String gradeLetter = "test";

        System.out.println("Your letter grade is " + gradeLetter);

    }
}
