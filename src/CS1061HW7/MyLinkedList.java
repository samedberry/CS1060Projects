package CS1061HW7;

import java.util.Collection;

public class MyLinkedList<E> implements MyList<E> {

    /**
     * Structure used to form the list.
     *
     * @param <E> - type of data element stored in node.
     * @author bobgils
     */
    class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node<E> rear;
    private int size = 0; // Number of elements in the list

    /**
     * Create an empty list
     */
    public MyLinkedList() {
    }

    /**
     * Create a list from an array of objects
     */
    public MyLinkedList(E[] objects) {
        for (E object : objects) add(object);
    }

    /**
     * Return the head element in the list
     */
    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return rear.next.element;
        }
    }

    /**
     * Return the last element in the list
     */
    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return rear.element;
        }
    }

    /**
     * Add an element to the beginning of the list
     */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node
        if (rear == null) { // the new node is the only node in list
            rear = newNode;
        } else{
            newNode.next = rear.next; // link the new node with the head
        }
        rear.next = newNode; // head points to the new node
        size++; // Increase list size

    }

    /**
     * Add an element to the end of the list
     */
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e); // Create a new for element e

        if (rear == null) {
            rear = newNode; // The new node is the only node in list
            rear.next = rear;
        } else {
            Node<E> temp = rear.next;
            rear.next = newNode;
            rear = newNode;
            rear.next = temp;
        }

        size++; // Increase size
    }

    /**
     * Add a new element at the specified index
     * in this list. The index of the head element is 0
     */
    @Override
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = rear.next;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }

    /**
     * Remove the head node and return the object that is contained in the removed node.
     */
    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            E temp = rear.next.element;
            rear.next = rear.next.next;
            size--;
            if (rear.next == null) {
                rear = null;
            }
            return temp;
        }
    }

    /**
     * Remove the last node and return the object that is contained in the removed node.
     */
    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            E temp = rear.next.element;
            rear.next = rear = null;
            size = 0;
            return temp;
        } else {
            Node<E> current = rear.next;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            E temp = rear.element;
            current.next = rear.next;
            rear = current;
            size--;
            return temp;
        }
    }

    /**
     * Remove the element at the specified position in this list. Return the element that was removed from the list.
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> previous = rear.next;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    /**
     * Override toString() to return elements in the list
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        if (rear != null){
            Node<E> current = rear.next;
            for (int i = 0; i < size; i++) {
                result.append(current.element);
                current = current.next;
                if (i < size-1) {
                    result.append(", ");
                }
            }
        }

        result.append("]");

        return result.toString();
    }

    /**
     * Clear the list
     */
    @Override
    public void clear() {
        size = 0;
        rear.next = rear = null;
    }

    /**
     * Return true if this list contains the element e
     */
    @Override
    public boolean contains(Object e) {
        // Left as an exercise
        for (E element : this) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return the element at the specified index
     */
    @Override
    public E get(int index) {
        // Left as an exercise
        checkIndex(index);
        Node current = rear.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (E) current.element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    /**
     * Return the index of the head matching element in this list. Return -1 if no match.
     */
    @Override
    public int indexOf(Object e) {
        // Left as an exercise
        Node current = rear.next;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    /**
     * Return the index of the last matching element in this list. Return -1 if no match.
     */
    @Override
    public int lastIndexOf(E e) {
        // Left as an exercise
        Node current = rear.next;
        for (int i = size - 1; i >= 0; i--) {
            if (current.element.equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Replace the element at the specified position in this list with the specified element.
     */
    @Override
    public E set(int index, E e) {
        // Left as an exercise
        Node current = rear.next;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        current.element = e;
        return null;
    }

    /**
     * Override iterator() defined in Iterable
     */
    @Override
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object collectable: c) {
            if (!this.contains(collectable)) {
                return false;
            }
        }
        return true;
    }

    private class LinkedListIterator implements java.util.Iterator<E> {
        private Node<E> current = rear.next; // Current index
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return (counter < size);
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            counter = counter+1;
            return e;
        }

    }

    /**
     * Return the number of elements in this list
     */
    @Override
    public int size() {
        return size;
    }
}

