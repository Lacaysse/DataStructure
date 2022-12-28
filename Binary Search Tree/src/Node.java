public class Node<T> {

    T data;
    Node<T> left;
    Node<T> right;
    Node<T> next;

    Node(T data) {
        this.data = data;
        left = right = null;
        this.next = null;
        
    }
}
