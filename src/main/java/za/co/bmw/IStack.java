package za.co.bmw;

import za.co.bmw.exception.StackException;

public interface IStack<E> {

    /**
     * Pushes an item onto the top of this stack
     */
    void push(E item) throws StackException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function
     */
    E pop() throws StackException;

    /**
     * Tests if this stack is empty
     */
    boolean empty();

    /**
     * The number of items on the stack
     * @return int
     */
    int count();
}
