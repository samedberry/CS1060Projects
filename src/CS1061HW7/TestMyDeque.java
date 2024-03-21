package CS1061HW7;

import java.util.Collection;

public class TestMyDeque {
  /** Main method */
  public static void main(String[] args) {
    // Create a list for strings
    MyDeque<String> list = new MyDeque<String>();

    // Add elements to the list
    list.addFirst("America"); // Add it to the list
    System.out.println("(1) " + list);

    list.addLast("Canada"); // Add it to the beginning of the list //This comment is wrong because addLast is invoked
    System.out.println("(2) " + list);

    list.addLast("Russia"); // Add it to the end of the list
    System.out.println("(3) " + list);

    list.addFirst("France");
    list.removeFirst();

    System.out.println("(4) " + list);

    list.removeLast();
    System.out.println("the first element is: " + list.getFirst());

    list.addLast("Germany"); // Add it to the end of the list
    System.out.println("(5) " + list);

    list.removeFirst();
    System.out.println("(6) " + list);

    System.out.println("the last element is: " + list.getLast());
    list.removeLast();

    System.out.println("(6) " + list);

    java.util.Iterator<String> itr = list.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next().toUpperCase() + " ");
    }
//    list.add(0,"Nowhere"); //this instruction should not compile!!
    System.out.println("(6) " + list);

    list.clear();
    if (list.isEmpty())
      System.out.println("\nAfter clearing the list, the list size is " + list.size());
    else
      System.out.println("\nAfter clearing the list, the list is not empty: " + list.size());
  }
}