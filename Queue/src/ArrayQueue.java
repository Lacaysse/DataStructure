class Queue<T> {

    T[] Q;
    int Front;
    int Rear;
    int Max = -1;

    public Queue() {

        Q = (T[]) (new Object[10]);
        Front = 9;
        Rear = 9;
    }

    public Queue(int size) {

        Q = (T[]) new Object[10];
        Front = -1;
        Rear = -1;
    }

    public class ArrayQueue<T> {

        public void Enqueue(T obj) {

            if (Rear < Max - 1) {
                Rear = Rear + 1;
                Q[Rear] = obj;
            }
        }

        public T dequeue() {


            T Result = (T) Q[0];

            Rear--;

            // shift the elements
            for (int scan = 0; scan < Rear; scan++)
                Q[scan] = Q[scan + 1];


            Q[Rear] = null;

            return Result;
        }

        public boolean isEmpty() {
            return (Rear == 0);
        }
    }

    public boolean isFull() {
        return ((Rear + 1) % Max == Front);
    }
}





