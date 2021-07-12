package za.co.bmw;

import za.co.bmw.exception.StackException;

@SuppressWarnings("unchecked") //To avoid an unchecked warning issued by compiler
public class StackImpl<E> implements IStack<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int top; // Reference to the top element
    private E[] A;

    /**
     * Creates a Stack of the size initialCapacity
     */
    public StackImpl(int initialCapacity) {
        if (initialCapacity <= 0)
            A = (E[]) new Object[DEFAULT_CAPACITY]; //WARNING: Unchecked cast: 'java.lang.Object[]' to 'E[]'
        else
            A = (E[]) new Object[initialCapacity];

        top = -1; //stack is empty
    }

    /**
     * Creates a Stack with the default capacity
     */
    public StackImpl() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Inserts an item onto the top of the stack
     */
    public void push(E e) throws StackException {
        if (top == A.length) {
            throw new StackException("Stack has overflowed");
        } else {
            top++;
            A[top] = e;
        }
    }

    @Override
    public E pop() throws StackException {
        if (empty()) {
            throw new StackException("Stack is empty");
        } else {
            E item = A[top];
            A[top] = null; //make sure the object is destroyed
            top--;
            System.out.println("pop -> " + item);
            return item;
        }
    }

    @Override
    public boolean empty() {
        return top == -1; // return true if satisfies or else false
    }

    @Override
    public int count() {
        return top + 1;
    }
}
