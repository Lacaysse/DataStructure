public class LinkedList<T> {
    Node head;
    int size = 0;

    public void insert(T value) {
        size++;
        Node n = new Node(value);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }

    }

    public void delete(T d) {
        Node<T> temp = head, prev = head;

        while (temp != null && temp.data != (d)) {

            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("not fount to delete node");
        } else if (temp == head) {
            head = head.next;
        } else {
            prev.next = temp.next;
        }

    }

    public T get(int i) {
        int j = 0;
        Node<T> temp = head;
        while (j < i && temp != null) {
            temp = temp.next;
            j++;
        }
        return temp.data;
    }

    public int getsize() {
        return size;
    }

    public String toString() {
        String str = "";
        Node temp = head;

        while (temp != null) {

            str = str + temp.data.toString() + ", ";
            temp = temp.next;
        }
        return str;
    }

    public boolean find(String value) {
        return false;
    }
}

