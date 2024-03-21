package CS1061HW7;

import java.util.Iterator;

public class MyDeque<E> implements Deque {
    private MyLinkedList<E> dequeList;

    public MyDeque() {
        this.dequeList = new MyLinkedList<E>();
    }

    public int size() {
        return dequeList.size();
    }

    public boolean isEmpty() {
        return dequeList.isEmpty();
    }

    public E getFirst() {
        return dequeList.getFirst();
    }

    public E getLast() {
        return dequeList.getLast();
    }

    public void addFirst(Object e) {
        dequeList.addFirst((E) e);
    }

    public void addLast(Object e) {
        dequeList.addLast((E) e);
    }

    public E removeFirst() {
        return dequeList.removeFirst();
    }

    public E removeLast() {
        return dequeList.removeLast();
    }

    public Iterator iterator(){
        return dequeList.iterator();
    }

    public void clear(){
        dequeList.clear();
    }

    @Override
    public String toString() {
        return dequeList.toString();
    }
}
