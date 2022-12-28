public class ArrayStack<T extends Comparable<T>> {

    T stackList[];
    int top;
    int max;


    ArrayStack(int size) {
        top = 0;
        stackList = (T[]) new Comparable[size];
        max = size;
    }

    public static void main(String[] args) {

        ArrayStack A = new ArrayStack<String>(10);

        A.PUSH("A");
        A.PUSH("B");
        A.PUSH("D");
        A.PUSH("F");
        A.PUSH("7");
        A.PUSH("N");
        A.PUSH("M");
        A.PUSH("P");
        A.PUSH("P");


        System.out.println(A.isEmpty());
        System.out.println(A.isFull());
        System.out.print(A);


    }

    public void PUSH(T c) {

        stackList[top] = c;
        top++;
    }

    public T POP() throws Exception {

        if (isEmpty()) throw new Exception();

        else return stackList[top--];

    }

    public Boolean isEmpty() {

        if (top == 0) {
            return true;
        } else return false;
    }

    public Boolean isFull() {

        return (top == max - 1);
    }

    public String toString() {
        String S = "";

        for (int i = 0; i < top; i++)
            S = S + stackList[i].toString() + "\n";

        return S;
    }
}
