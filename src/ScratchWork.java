//FiguringOutMyGrade
//in class exercise

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScratchWork {
    public static void main(String[] args) {

        try (Scanner input1 = new Scanner(new FileReader("grades.csv"))){
            System.out.println(input1.nextLine());
        } catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }

//        System.out.println(input1.nextInt());

    }
}
