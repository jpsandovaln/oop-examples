package structure;

/**
 * @author HP
 * @version 1.1
 */
public class MyLinkedList<T> {
    private Node first;
    private Node last;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void add(T data) {
        Node newNode = new Node(data);
        newNode.setNext(null);

        if(this.first == null) {
            this.first = newNode;
        } else {
            this.last.setNext(newNode);
        }
        this.last = newNode;
    }

    public void print() {
        Node node = this.first;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public void addLast(T data) {
        this.add(data);
    }

    public void addFirst(T data) {
        Node newNode = new Node(data);

        if (this.first == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            newNode.setNext(this.first);
            this.first = newNode;
        }
    }
}
