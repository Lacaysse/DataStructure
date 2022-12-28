public class ArrayStack_Paranthesis<T extends Comparable<T>> {

    T stackList[];
    int top;
    int max;


    ArrayStack_Paranthesis(int size) {
        top = 0;
        stackList = (T[]) new Comparable[size];
        max = size;
    }

    public static void main(String[] args) {

        ArrayStack_Paranthesis A = new ArrayStack_Paranthesis(10);

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

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"NP_ALWAYS_NULL", "NP_ALWAYS_NULL", "NP_ALWAYS_NULL"})
    public Boolean Validate(String Exp) throws Exception {
        ArrayStack_Paranthesis S = null;

        for (int i = 0; i < Exp.length(); i++) {
            char symb = Exp.charAt(i);

            if (symb == '(' || symb == '{' || symb == '[') {
                S.PUSH(symb);
            }

            if (symb == ')' || symb == '}' || symb == ']') {
                if (S.isEmpty()) return false;
                else {
                    char item = (char) S.POP();
                    if (item != symb) return false;
                }
            }
        }
        if (!S.isEmpty()) return false;

        else return true;

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
