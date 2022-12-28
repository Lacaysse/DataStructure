import java.util.Arrays;

public class MaxHeap<T extends Comparable<T>> {

    T[] heap;
    int size;

    public MaxHeap(int s) {
        size = 0;

        if (size >= 1) {
            heap = (T[]) new Comparable[s];
        } else {
            heap = (T[]) new Comparable[10];
        }
    }

    public int getleft(int i) {
        return (2 * i + 1);
    }

    public int getright(int i) {
        return (2 * i + 2);
    }

    public int getparent(int i) {
        return (i - 1 / 2);
    }

    public T getMax() {
        return heap[0];
    }

    public void swap(int FirstIndex, int SecondIndex) {
        T temp = heap[FirstIndex];
        heap[FirstIndex] = heap[SecondIndex];
        heap[SecondIndex] = temp;
    }

    public void siftup(int index) {
        if (index > 0 && heap[getparent(index)].compareTo(heap[index]) < 0) {
            swap(index, getparent(index));
            siftup(getparent(index));
        }
    }

    public void insert(T value) {
        if (size >= heap.length) {
            System.out.println("Heap Full");
            return;
        }

        heap[size] = value;
        siftup(size);
        size++;
    }

    public void siftdown(int index) {
        int left = getleft(index);
        int right = getright(index);
        int largest = index;

        if (left < heap.length && heap[left].compareTo(heap[largest]) < 0) {
            largest = left;
        }

        if (right < heap.length && heap[right].compareTo(heap[largest]) > 0) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            siftdown(largest);
        }
    }

    public T extractmax() {
        T max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftdown(0);
        return max;
    }

    public int find(T d) {
        for (int a = 0; a < size; a++) {
            if (heap[a].compareTo(d) == 0) {
                return a;
            }
        }
        return -1;
    }

    public void remove(T d) {
        int i = find(d);
        if (i == -1) {
            return;
        }

        heap[i] = heap[size - 1];
        size--;
        siftdown(i);

    }

    public void print() {
        System.out.println(Arrays.toString(Arrays.copyOfRange(heap, 0, size)));
    }

    public static void main(String[] args) {

        MaxHeap<Integer> M = new MaxHeap<Integer>(10);

        M.insert(4);
        M.insert(34);
        M.insert(21);
        M.insert(3);
        M.insert(87);
        M.insert(19);
        M.insert(5);
        M.insert(4);

        M.siftup(2);
        M.swap(0, 7);

        System.out.println(M.extractmax());


        M.print();
    }
}
