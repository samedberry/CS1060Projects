//FiguringOutMyGrade
//in class exercise

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScratchWork {
    public static void main(String[] args) {


        File file = new File("grades.csv");

        FileReader fileReader = null;
        try{
            fileReader = new FileReader(file);
        } catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        Scanner input1 = new Scanner(fileReader);

        System.out.println(input1.nextInt());

    }
}
