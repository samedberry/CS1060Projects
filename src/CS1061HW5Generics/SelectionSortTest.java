package CS1061HW5Generics;

// SelectionSortTest.java
// Sorting an array with selection sort.

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest
{
   public static void main(String[] args)
   {
      //create array and populate w/ random numbers
      SecureRandom generator = new SecureRandom();
      Integer[] data = new Integer[10];
      for (int i = 0; i < data.length; i++) {
         data[i] = 10 + generator.nextInt(90);
      }

      //display sorting of array (selectionSort() includes print statements)
      System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
      selectionSort(data);
      System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));


      //NON-NUMERIC ARRAY DEMO
      Character[] characters = new Character[10];
      for (int i = 0; i < characters.length; i++) {
         characters[i] = (char)('a'+generator.nextInt(26));
      }

      //display sorting of array (selectionSort() includes print statements)
      System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(characters));
      selectionSort(characters);
      System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(characters));
   }

   // sort array using selection sort
   public static <T extends Comparable> void selectionSort(T[] data)
   {
      // loop over data.length - 1 elements
      for (int i = 0; i < data.length - 1; i++)
      {
         int smallest = i; // first index of remaining array

         // loop to find index of smallest element
         for (int index = i + 1; index < data.length; index++)
            if (data[index].compareTo(data[smallest]) < 0)
               smallest = index;

         swap(data, i, smallest); // swap smallest element into position
         printPass(data, i + 1, smallest); // output pass of algorithm
      }
   } // end method selectionSort

   // helper method to swap values in two elements
   private static <T extends Comparable> void swap(T[] data, int first, int second) {
      T temporary = data[first];
      data[first] = data[second];
      data[second] = temporary;
   }

   // print the state of an array after a loop and show which value was effected
   private static <T extends Comparable> void printPass(T[] data, int pass, int index)
   {
      // output array
      System.out.printf("after pass %2d: ", pass);
      for (int i = 0; i < index; i++)
         System.out.print(data[i] + "  ");
      System.out.print(data[index] + "*  "); // indicate effected element
      // finish outputting array
      for (int i = index + 1; i < data.length; i++)
         System.out.print(data[i] + "  ");

      // indicate amount of array that's been looped over
      System.out.printf("%n               ");
      for (int j = 0; j < pass; j++){
         for (int i = 0; i < data[j].toString().length(); i++){
            System.out.print("-");
         }
         System.out.print("  ");
      }
      System.out.println();
   }
}
