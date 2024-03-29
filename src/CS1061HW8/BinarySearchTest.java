package CS1061HW8;

// BinarySearchTest.java
// Use binary search to locate an item in an array.
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest
{
   // perform a binary search on the data      
   public static int binarySearch(int[] data, int key) {
      return recursiveBinarySearch(data, key, 0, data.length-1); // return location of search key
   } // end method binarySearch
   public static int recursiveBinarySearch(int[] data, int key, int start, int end) {
      int low = start; // low end of the search area
      int high = end; // high end of the search area
      int middle = (low + high + 1) / 2; // middle element
      int location = -1; // return value; -1 if not found

      if  (low > high) {
         return location;
      } else {
         System.out.print(remainingElements(data, low, high));
         for (int i = 0; i < middle; i++)
            System.out.print("   ");
         System.out.println(" * ");

         // if the element is found at the middle
         if (key == data[middle])
            return middle; // location is the current middle
         else if (key < data[middle]) // middle element is too high
            high = middle - 1; // eliminate the higher half
         else  // middle element is too low
            low = middle + 1; // eliminate the lower half
         return recursiveBinarySearch(data, key, low, high);

      }
   }

   // method to output certain values in array
   private static String remainingElements(int[] data, int low, int high)
   {
      StringBuilder temporary = new StringBuilder();

      // append spaces for alignment
      for (int i = 0; i < low; i++)
         temporary.append("   ");

      // append elements left in array
      for (int i = low; i <= high; i++)
         temporary.append(data[i] + " ");

      return String.format("%s%n", temporary);
   } // end method remainingElements

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      SecureRandom generator = new SecureRandom();

      int[] data = new int[15]; // create array

      for (int i = 0; i < data.length; i++) // populate array
         data[i] = 10 + generator.nextInt(90);

      Arrays.sort(data); // binarySearch requires sorted array
      System.out.printf("%s%n%n", Arrays.toString(data)); // display array

      // get input from user
      System.out.print("Please enter an integer value (-1 to quit): ");
      int searchInt = input.nextInt(); 

      // repeatedly input an integer; -1 terminates the program
      while (searchInt != -1)
      {
         // perform search
         int location = binarySearch(data, searchInt);
//         int location = recursiveBinarySearch(data, searchInt);

         if (location == -1) // not found
            System.out.printf("%d was not found%n%n", searchInt); 
         else // found
            System.out.printf("%d was found in position %d%n%n", 
               searchInt, location);

         // get input from user
         System.out.print("Please enter an integer value (-1 to quit): ");
         searchInt = input.nextInt();
      } 
   } // end main
} // end class BinarySearchTest
