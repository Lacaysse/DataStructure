public class BinaryTreeArray<T extends Comparable<T>> {

    T[] tree;

    public BinaryTreeArray(int size) {
        tree = (T[]) new Comparable[size];
    }

    public static void main(String[] args) {

        BinaryTreeArray<Integer> BST = new BinaryTreeArray<>(20);

        BST.insert(20);
        BST.insert(10);
        BST.insert(5);
        BST.insert(23);
        BST.insert(11);
        BST.insert(21);
        BST.insert(15);

        BST.traverse(0); //traversing from 0th index

        System.out.println();

        System.out.println(BST.find(21));
        System.out.println(BST.find(67));


    }

    public void insert(T data) {

        int currindex = 0;

        if (tree[0] == null) {
            tree[0] = data;
            return;
        }
        while (currindex < tree.length && tree[currindex] != null) {

            if (data.compareTo(tree[currindex]) <= 0) {
                currindex = (currindex * 2) + 1;
            } else {
                currindex = (currindex * 2) + 2;
            }
        }

        tree[currindex] = data;
    }

    public boolean find(T data) {
        int currindex = 0;

        while (currindex < tree.length && tree[currindex] != null) {

            if (data.compareTo(tree[currindex]) == 0) {
                return true;
            }

            if (data.compareTo(tree[currindex]) <= 0) {
                currindex = (currindex * 2) + 1;
            } else {
                currindex = (currindex * 2) + 2;
            }
        }
        return false;
    }

    public void traverse(int index) {

        if (index >= tree.length || tree[index] == null) {
            return;
        }
        traverse((index * 2) + 1);
        System.out.println(tree[index]);
        traverse((index * 2) + 2);

    }
}
