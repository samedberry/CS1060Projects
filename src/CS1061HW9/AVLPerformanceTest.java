package CS1061HW9;

import java.util.Arrays;

public class AVLPerformanceTest {
    public static void main(String[] args) {


        Integer[] numbers;
        long startTime;
        long endTime;
        long timeElapsed;
        int arraySize;
        BST<Integer> testBST;
        AVLTree<Integer> testAVL;

        for (int iter = 1; iter <= 6; iter++) {
            arraySize = (int) Math.pow(10, iter);
            numbers = new Integer[arraySize];
            for (int i = 0; i < arraySize; i++) {
                numbers[i] = (int) (Math.random() * 10 * arraySize);
            }
            Arrays.sort(numbers);

            System.out.println("Tree creation through constructor(E[] objects) with [] length = " + arraySize + "\n");
            startTime = System.nanoTime();
            testBST = new BST<Integer>(numbers);
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            System.out.println("BST constructor() execution time for " + arraySize + " elements is " + timeElapsed + " nanoseconds\n");
            startTime = System.nanoTime();
            testAVL = new AVLTree<Integer>(numbers);
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            System.out.println("AVL constructor() execution time for " + arraySize + " elements is " + timeElapsed + " nanoseconds\n");
            System.out.println("\n");
            System.out.println("Average element search time comparison\n");
            startTime = System.nanoTime();
            for (Integer number : numbers) {
                testBST.search(number);
            }
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            System.out.println("BST average search execution time for " + arraySize + " elements is " + timeElapsed / arraySize + " nanoseconds\n");
            startTime = System.nanoTime();
            for (Integer number : numbers) {
                testAVL.search(number);
            }
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            System.out.println("AVL average search execution time for " + arraySize + " elements is " + timeElapsed / arraySize + " nanoseconds\n");
            System.out.println("\n");

        }
    }
}
