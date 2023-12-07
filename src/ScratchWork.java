//FiguringOutMyGrade
//in class exercise

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScratchWork {
    public static void main(String[] args) throws Exception {
//        try (Scanner input1 = new Scanner(new FileReader("grades.csv"))){
//            System.out.println(input1.nextLine());
//        } catch(FileNotFoundException e){
//            System.out.println("File Not Found");
//        }
        //Scanner useDelimiter

        Scanner sc = new Scanner(new FileInputStream("grades.csv"));
        sc.nextLine();
        List<Integer> grades = new ArrayList<>();
        String classNumber = "";

        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (!line.substring(line.length() - 1).equals("W")) {
                int firstComma = line.indexOf(",");
                String noClassName = line.substring(firstComma + 1);
                int secondComma = noClassName.indexOf(",");
                String noClassNumber = noClassName.substring(secondComma + 1);
                String gradeAsString = noClassNumber.substring(0, noClassNumber.indexOf(","));
                if (classNumber.equals(noClassName.substring(0, secondComma)) && grades.get(grades.size() - 1) < Integer.parseInt(gradeAsString)) {
                    classNumber = noClassName.substring(0, secondComma);
                    grades.set(grades.size() - 1, (Integer.parseInt(gradeAsString)));
                } else if (gradeAsString) {

                }else {
                    classNumber = noClassName.substring(0, secondComma);
                    try {
                        grades.add(Integer.parseInt(gradeAsString));
                    } catch (NumberFormatException e) {
                        //convert letter to number and add to list
                    }
                }
            }
        }

        int sum = 0;
        for (int i : grades) {
            sum += i;
        }

        System.out.println("Average: " + sum / grades.size());
    }
}
