public class ArrayMain {
    public static void main(String[] args) {


        ArrayQueue<Integer> Q = new ArrayQueue<>(10);
        Q.Enqueue(5);
        Q.Enqueue(23);
        Q.Enqueue(20);
        Q.Enqueue(6);
        Q.Enqueue(90);
        Q.Enqueue(75);

        Q.Dequeue(); //Dequeues from the Rear Element (5)
        Q.Dequeue(); //Dequeues from the Rear Element (6)
        Q.Dequeue(); //Dequeues from the Rear Element (20)


        System.out.println(Q);
        
        System.out.println(Q.isEmpty());
        System.out.println(Q.isFull());

    }
}

