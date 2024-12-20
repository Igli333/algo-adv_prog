package Seminar2.Doubly;

public class DoublyListNode<AnyType> {
    public AnyType element;
    public DoublyListNode<AnyType> previous;
    public DoublyListNode<AnyType> next;

    public DoublyListNode() {
        element = null;
        previous = null;
        next = null;
    }

    public DoublyListNode(AnyType element) {
        this.element = element;
        previous = null;
        next = null;
    }
}
