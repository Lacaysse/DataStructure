public class ArrayQueue<T extends Comparable<T>> {


    T[] Q;
    int Front;
    int Rear;
    int Size;

    public ArrayQueue() {

        Q = (T[]) new Comparable[10];
        Front = -1;
        //Rear = -1;

    }

    public ArrayQueue(int size) {

        Q = (T[]) new Comparable[size];
        Front = -1;
        //Rear = -1;
    }

    public void Enqueue(T obj) {

        if (isEmpty()) {
            Q[0] = obj;
            Front = 0;
            return;
        }

        for (int i = Front; i >= 0; i--) {
            if (Q[i].compareTo(obj) > 0 || Q[i].compareTo(obj) == 0) {
                Q[i + 1] = obj;
                break;
            }
            if (Q[i].compareTo(obj) < 0) {
                Q[i + 1] = Q[i];
                Q[i] = obj;
            }
        }
        Front++;
    }


    public T Dequeue() {
        if (isEmpty()) {
            return null;
        }
        T temp = Q[Front];
        Q[Front--] = null;
        return temp;
    }


    public boolean isEmpty() {
        return Front == -1;
    }

    public boolean isFull() {
        return Front == Size - 1;
    }


    public T peek() {

        T temp = null;
        if (!isEmpty()) {
            temp = Q[0];
        }
        return temp;
    }


    public String toString() {

        String str = "";

        for (int i = 0; i < Q.length; i++) {
            if (Q[i] != null) {
                str = str + "\n" + Q[i];
            }
        }
        return str;
    }
}




