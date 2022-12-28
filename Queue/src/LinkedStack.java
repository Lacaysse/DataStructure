class StackNode<T> {
    T info;
    StackNode<T> next;
    StackNode<T> top;


    public StackNode(T data) {
        info = data;
    }
}

public class LinkedStack<T> {

    StackNode<T> top;

    public static void main(String[] args) throws Exception {

        LinkedStack<String> L = new LinkedStack<String>();

        L.PUSH("F");
        L.PUSH("N");
        L.PUSH("P");
        L.PUSH("S");
        L.PUSH("D");

        L.POP();
        System.out.println(L);
        System.out.println(L.isEmpty());
    }


    public void PUSH(T c) {

        StackNode<T> temp = new StackNode<>(c);

        temp.next = top;
        top = temp;
        

    }

    public T POP() throws Exception {

        if (isEmpty()) {
            throw new Exception();
        }

        StackNode<T> N = top;
        top = top.next;

        return N.info;
    }

    public Boolean isEmpty() {
        return (top == null);
    }

    public String toString() {
        String result = "";
        StackNode<T> current = top;

        while (current != null) {
            result = result + (current.info.toString() + "\n");
            current = current.next;
        }

        return result;
    }
}

