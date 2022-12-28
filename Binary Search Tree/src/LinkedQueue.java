public class LinkedQueue<T> {

    Node<T> Front;
    Node<T> Rear;


    public void Enqueue(T obj) {

        Node<T> Temp = new Node<>(obj);

        if (this.Rear == null) {
            this.Front = this.Rear = Temp;
            return;
        }

        this.Rear.next = Temp;
        this.Rear = Temp;
    }

    public Node<T> Dequeue() {


        if (this.Front == null) {
            return null;
        }

        Node<T> temp = this.Front;
        this.Front = this.Front.next;

        if (this.Front == null) {
            this.Rear = null;
        }
        return temp;
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
