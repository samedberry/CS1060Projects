/**
 * This was what I started not realizing I was supposed to be modifying an existing file.
 */

//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class TurtleGraphicsMyVersion {
//    static int[][] floor = new int[20][20];
//    int facing = 0;
//    boolean pen = false;
//    public static void main(String[] args) {
//        //initialize floor with blanks
//        for (int y = 0; y < 20; y++) {
//            for (int x = 0; x < 20; x ++) {
//                floor[y][x] = 0;
//            }
//        }
//
//        int[][] cmnds = new int[0][0];
//        if (enterCommands(cmnds) == 1) {
//            executeCommands(cmnds);
//        }
//    }
//
//    public int enterCommands(int[][] cmnds) {
//        //scan in turtleProgram (ex. SwissCross.txt)
//        StringBuilder userCommands = new StringBuilder();
//
//        try {
//            File file = new File("SwissCross.txt");
//            FileReader fileReader = new FileReader(file);
//            Scanner input1 = new Scanner(fileReader);
//            while (input1.hasNextLine()) {
//                userCommands.append(input1.nextLine());
//                userCommands.append(" ");
//            }
//        } catch (IOException e) {
//            System.out.println("Invalid Turtle Program.");
//            return 0;
//        }
//
//        //check for problems
//        // if error, display message and return 0
//
//        //if no errors, "compile" turtle graphics program into cmnds and return 1
//    }
//
//    public boolean executeCommands(int[][] cmnds, int count) {
//        //execute the compiled version of the inputted program
//        //signature and return type were provided by directions so compiled directions
//        // also have to be in an int[][] array.
//
//        //the turtle "spins its wheels" if it is directed to move beyond a boundary
//
//    }
//}
