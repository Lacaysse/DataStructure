public class LinkedList<T> {

    Node<T> head;
    private int length = 0;


    LinkedList() {
        this.head = null;
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList<Integer>();

        L.add(20);
        L.add(20);
        L.add(20);
        L.add(20);
        L.add(20);

        System.out.println(L);

        System.out.println(L.find(20));


    }


    public void add(T data) {

        Node<T> temp = new Node<>(data);

        if (this.head == null) {
            head = temp;
        } else {

            Node<T> X = head;

            while (X.next != null) {
                X = X.next;
            }
            X.next = temp;
        }
        length++;
    }

    public void remove(T key) {

        Node<T> prev = new Node<>(null);

        prev.next = head;


        Node<T> next = head.next;

        Node<T> temp = head;

        boolean exists = false;

        if (head.data == key) {
            head = head.next;

            exists = true;
        }


        while (temp.next != null) {

            if (String.valueOf(temp.data).equals(
                    String.valueOf(key))) {

                prev.next = next;

                exists = true;

                break;
            }

            prev = temp;

            temp = temp.next;

            next = temp.next;
        }


        if (exists == false && String.valueOf(temp.data).equals(String.valueOf(key))) {

            prev.next = null;

            exists = true;
        }
        if (exists) {

            length--;
        } else {
            System.out.println("Given Value is not present in linked list");
        }
    }


    public void clear() {
        head = null;
        length = 0;
    }

    boolean empty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    int length() {
        return this.length;
    }


    public String toString() {
        String S = "{ ";

        Node<T> X = head;

        if (X == null)
            return S + " }";

        while (X.next != null) {
            S += String.valueOf(X.data) + " -> ";
            X = X.next;
        }

        S += String.valueOf(X.data);
        return S + " }";
    }

    public boolean find(T data) {

        Node currentPointer = head;

        while (currentPointer != null) {
            if (currentPointer.data == data)
                return true;
            currentPointer = currentPointer.next;
        }
        return false;
    }
}
