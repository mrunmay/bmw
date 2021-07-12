package za.co.bmw.exception;

public class StackException extends RuntimeException {

    public StackException(String name) {
        super(name);
    }

    public StackException() {
        super();
    }
}
