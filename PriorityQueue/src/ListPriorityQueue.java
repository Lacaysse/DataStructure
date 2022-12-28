class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;

    public Node(T d) {
        this.data = d;
        next = null;
    }
}

public class ListPriorityQueue<T extends Comparable<T>> {
    Node<T> front;
    Node<T> rear;

    public boolean isEmpty() {
        return (front == null);
    }

    public void Enqueue(T obj) {
        Node n = new Node(obj);
        if (isEmpty()) {
            front = n;
            rear = front;
        } else if (front.data.compareTo(obj) > 0) {
            n.next = front;
            front = n;
        } else {
            Node prevNode = front;
            rear = front;
            while (rear != null && front.data.compareTo(obj) < 0) {
                prevNode = rear;
                rear = rear.next;
            }
            n.next = rear;
            prevNode.next = n;
        }
    }

    public T Dequeue() {
        if (!isEmpty()) {
            T temp = front.data;
            front = front.next;
            return temp;
        }
        return null;
    }

    public String toString() {
        Node temp = front;
        String s = "";
        while (temp.next != null) {
            s = s + (temp.data + ", ");
            temp = temp.next;
        }
        s = s + temp.data;
        return s;
    }
}


