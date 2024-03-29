package CS1061HW8;

public class HeapSort {
  /** Heap sort method */
  public static <E extends Comparable> void heapSort(E[] list) {
    // Create a Heap of integers
    Heap<E> heap = new Heap<E>();

    // Add elements to the heap
    for (int i = 0; i < list.length; i++)
      heap.add(list[i]);

    heap.printHeap();
  }
  
  /** A test method */
  public static void main(String[] args) {
    Integer[] list = new Integer[20];


    for (int i = 0; i < list.length; i ++) {
      list[i] = (int)(Math.random()*100);
    }

    heapSort(list);
  }
}
