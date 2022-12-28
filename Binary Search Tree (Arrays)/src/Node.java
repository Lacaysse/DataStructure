public class Node<T> {

    T data;
    Node<T> left;
    Node<T> right;
    Node<T> next;
    Node<T> parent;

    public Node(T data) {
        this.parent = null;
        this.data = data;
        left = right = null;
        this.next = null;
    }
}

