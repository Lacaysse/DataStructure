class Node<T> {

    T data;
    Node<T> next;

    //constructor
    public Node() {
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedQueue<T> {

    Node<T> Front;
    Node<T> Rear;

    public static void main(String[] args) {

        LinkedQueue First = new LinkedQueue<String>();

        First.Enqueue("Geralt");
        First.Enqueue("Rivia");
        First.Enqueue("Elliot");
        First.Enqueue("John");
        First.Enqueue("Frank Castle");

        First.Dequeue(); //dequeues Geralt from the list

        System.out.println("Is the LinkedList Queue Empty?: " + First.isEmpty());
        System.out.println();

        System.out.println("The Elements of the LinkedListQueue are Listed: ");
        System.out.print(First);


    }

    public void Enqueue(T obj) {

        Node<T> Temp = new Node<>(obj);

        if (this.Rear == null) {
            this.Front = this.Rear = Temp;
            return;
        }

        this.Rear.next = Temp;
        this.Rear = Temp;
    }

    public void Dequeue() {


        if (this.Front == null) {
            return;
        }

        Node<T> temp = this.Front;
        this.Front = this.Front.next;

        if (this.Front == null) {
            this.Rear = null;
        }
    }

    public boolean isEmpty() {

        return (Front == null);
    }

    public String toString() {
        String result = "";
        Node<T> current = Front;

        while (current != null) {
            result = result + (current.data.toString() + "\n");
            current = current.next;
        }

        return result;
    }
}



