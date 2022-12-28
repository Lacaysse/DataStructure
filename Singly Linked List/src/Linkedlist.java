public class Linkedlist {


    Node head;

    Linkedlist() {
        head = null;
    }

    public void insert(int d) {

        Node newNode = new Node(d);
        Node temp = head;

        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public Boolean find(int d) {
        Node temp = head;

        if (head == null) System.out.println("The List is empty!");

        else {
            while (temp != null) {

                if (temp.data == d) return true;
            }
        }
        return false;
    }

    public void clear() {
        head = null;
    }

    public void delete(int d) {
        Node temp = head;
        Node prev = null;

        while (temp != null && d != temp.data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) System.out.println("Cannot Delete!");

        else prev.next = temp.next;
    }

    public String toString() {

        String s = ", ";
        String a = "";

        Node temp = head;
        while (temp != null) {

            a = temp.data + s;
        }

        return a;
    }

    public Node insertBefore(Node n, int d) {

        if (head == n) {

            Node newNode = new Node(d);

            newNode.next = head;

            head = newNode;
            return newNode;
        } else {

            Node x = null;
            for (Node newNode = head; newNode != n; x = newNode, newNode = newNode.next) ;

            Node y = new Node(d);

            y.next = x.next;

            x.next = y;

            return y;

        }
    }

    public static void main(String[] args) {

        Linkedlist L1 = new Linkedlist();

        L1.insert(7);
        L1.insert(10);
        L1.insert(25);
        L1.insert(14);
        L1.insert(23);

        L1.delete(23);
        L1.delete(25);

        L1.toString();

    }
}
