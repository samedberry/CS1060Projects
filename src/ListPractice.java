import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {

    public static void main(String[] args) {
        reverseList();
        System.out.println();
        System.out.println(stringToList("CharacterBreakout"));
        System.out.println();
        System.out.println(createListWithBounds(5, 10, 2));
    }

    //    reads positive integers from the user, stores them in a list, and prints them out in reverse order.
//    user enters one number on each line and uses -1 to end
    public static void reverseList() {
        Scanner input1 = new Scanner(System.in);
        int inputNumber = 0;
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter values (-1 to stop)");
        while (inputNumber != -1) {
            inputNumber = input1.nextInt();
            if (inputNumber != -1) {
                numbers.add(inputNumber);
            }
        }

        System.out.println("Your values, reversed:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }

    //    method returns List<Character> with characters of argument string in order
    public static List<Character> stringToList(String text) {
        List<Character> textList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            textList.add(text.charAt(i));
        }
        return textList;
    }

    //    method takes three integer arguments, start, end, and step
//        end >= start
//    returns new list of integers
//        starts at start
//        increments by step
//        ends at end, does not include end
//    length-0 list is valid.
    public static List<Integer> createListWithBounds(int start, int end, int step) {
        int range = end - start;
        List<Integer> list = new ArrayList<>();
        if (range == 0) {
            return list;
        }

        int listLength;
        if (range > 0 && range % step == 0) {
            listLength = (range / step);
        } else {
            listLength = (range / step + 1);
        }

        for (int i = 0; i < listLength; i++) {
            list.add(start + step * i);
        }
        return list;
    }


    //function takes List<String>
    //returns *SAME LIST* with all strings containing "amoeba" (case-insensitive) removed
    //DO NOT CREATE ANOTHER LIST
    public static List<String> findAndDestroyAllAmoebas(List<String> stringList) {
        return stringList;
    }

}
