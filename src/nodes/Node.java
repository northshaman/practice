package nodes;

/**
 * Abstract Node for working with linked lists
 */
public class Node<T> {
    private Node next;
    private T value;

    @Override
    public String toString() {
        if (next == null) {
            return String.valueOf(value) + " -> null";
        } else
            return String.valueOf(value) + " -> " + next.toString();
    }
    public Node(){
    }

    public Node(Node next, T value) {
        this.next = next;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
