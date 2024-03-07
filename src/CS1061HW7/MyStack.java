package CS1061HW7;

// MyStack.java
// MyStack uses a composed List object.

public class MyStack<T> {
    private MyLinkedList<T> stackList;

    // constructor
    public MyStack() {
        stackList = new MyLinkedList<T>();
    }

    // add object to stack
    public void push(T object) {
        // to be completed as assignment
        stackList.addLast(object);
    }

    // remove object from stack
    public T pop() {
        // to be completed as assignment
        return stackList.removeLast();
    }

    // determine if stack is empty
    public boolean isEmpty() {
        // to be completed as assignment
        return stackList.isEmpty();
    }

    // output stack contents
    public void print() {
        System.out.println(stackList.toString());
    }
}
