package CS1061HW6;

import java.util.concurrent.TimeUnit;

// Program to calculate execution time or elapsed time in Java
public class TimeUtil {
    public static void main(String[] args) throws InterruptedException {

		int[] numbers = new int[10000];

        for (int i = 0; i < 100; i ++) {
            numbers[i] = (int)(Math.random()*100);
        }
        long startTime = System.nanoTime();
        BubbleSort.bubbleSort(numbers);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        System.out.println();

        for (int i = 0; i < 1000; i ++) {
            numbers[i] = (int)(Math.random()*1000);
        }
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(numbers);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        System.out.println();

        for (int i = 0; i < 5000; i ++) {
            numbers[i] = (int)(Math.random()*5000);
        }
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(numbers);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        System.out.println();

        for (int i = 0; i < 10000; i ++) {
            numbers[i] = (int)(Math.random()*10000);
        }
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(numbers);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        System.out.println();
    }
}