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
    [92, ∞): A              if gradePercent >= 92
    [89, 92): A-            if gradePercent >= 89 && gradePercent < 92
    [87, 89): B+            if gradePercent >= 87 && gradePercent < 89
    [82, 87): B             if gradePercent >= 82 && gradePercent < 87
    [79, 82): B-            if gradePercent >= 79 && gradePercent < 82
    [77, 79): C+            if gradePercent >= 77 && gradePercent < 79
    [72, 77): C             if gradePercent >= 72 && gradePercent < 77
    [69, 72): C-            if gradePercent >= 69 && gradePercent < 72
    [67, 69): D+            if gradePercent >= 67 && gradePercent < 69
    [60, 67): D             if gradePercent >= 60 && gradePercent < 67
    [0, 60): F              if gradePercent >= 0 && gradePercent < 60
*/

        String gradeLetter = "test";

        System.out.println("Your letter grade is " + gradeLetter);

    }
}
