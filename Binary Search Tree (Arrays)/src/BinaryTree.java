public class BinaryTree<T extends Comparable<T>> {

    Node<T> Root;

    public static void main(String[] args) {

        BinaryTree T = new BinaryTree<Integer>();

        Node root = T.insert(10);
        T.insert(20);
        T.insert(30);
        T.insert(25);
        T.insert(47);
        T.insert(15);
        T.insert(8);

        T.delete(8);

        Preorder(root);


    }

    public Node<T> insert(T d) {

        Node<T> newnode = new Node<T>(d);

        if (Root == null) {
            Root = newnode;
            return newnode;
        }

        Node<T> Temp = Root;
        Node<T> Prev = Root;

        while (Temp != null) {
            Prev = Temp;

            if (d.compareTo(Temp.data) <= 0) {
                Temp = Temp.left;
            } else if (d.compareTo(Temp.data) > 0) {
                Temp = Temp.right;
            }
        }

        if (d.compareTo(Prev.data) <= 0) {
            Prev.left = newnode;

        } else {
            Prev.right = newnode;

        }
        return newnode;
    }

    public static void Inorder(Node Temp) {

        if (Temp == null) {
            return;
        }

        Inorder(Temp.left);
        System.out.println(Temp.data + " ");
        Inorder(Temp.right);

    }

    public static void Preorder(Node Temp) {

        if (Temp == null) {
            return;
        }
        System.out.println(Temp.data + " ");
        Preorder(Temp.left);
        Preorder(Temp.right);
    }


    public static void Postorder(Node Temp) {

        if (Temp == null) {
            return;
        }

        Postorder(Temp.left);
        Postorder(Temp.right);
        System.out.println(Temp.data + " ");

    }

    public boolean find(T data) {

        Node<T> currentPointer = Root;

        while (currentPointer != null) {

            if (data.compareTo(currentPointer.data) == 0) return true;

            if (data.compareTo(currentPointer.data) < 0) {
                currentPointer = currentPointer.left;
            } else if (data.compareTo(currentPointer.data) > 0) {
                currentPointer = currentPointer.right;
            }
        }

        return false;
    }

    public void delNoChild(Node<T> parent, Node<T> temp) {

        if (temp.data.compareTo(parent.data) <= 0) {
            parent.left = null;
            temp = null;
        } else {
            parent.right = null;
            temp = null;
        }
    }

    public void delOneChild(Node parent, Node temp) {

        if (parent.left == temp) {

            if (temp.left != null) {
                parent.left = temp.left;
            } else {
                parent.left = temp.right;
            }
        } else {
            if (temp.left != null) {
                parent.right = temp.left;
            } else {
                parent.right = temp.right;
            }
        }
    }

    public Node<T> findMaxNodeLeftSubtree(Node<T> node) {
        Node<T> temp = node;
        Node<T> parent = node;
        temp = temp.left;

        while (temp.right != null) {
            parent = parent;
            temp = temp.right;
        }

        return temp;
    }

    public void delTwoChild(Node<T> temp) {

        Node<T> maxNode = this.findMaxNodeLeftSubtree(temp);

        temp.data = maxNode.data;

        if (maxNode.left == null && maxNode.right == null) {

            delNoChild(maxNode.parent, maxNode);
        } else {
            delOneChild(maxNode.parent, maxNode);
        }
    }

    public void delete(T data) {
        Node<T> currentPointer = Root;
        Node<T> previousPointer = Root;
        Node<T> foundNode = null;

        while (currentPointer != null) {
            if (data.compareTo(currentPointer.data) == 0) {
                foundNode = currentPointer;
                break;
            }

            previousPointer = currentPointer;

            if (data.compareTo(currentPointer.data) < 0) {
                currentPointer = currentPointer.left;
            } else if (data.compareTo(currentPointer.data) > 0) {
                currentPointer = currentPointer.right;
            }
        }

        if (foundNode != null) {
            if (foundNode.left == null && foundNode.right == null) {

                this.delNoChild(previousPointer, currentPointer);

            } else if ((foundNode.left != null && foundNode.right == null) || (foundNode.left == null && foundNode.right != null)) {
                this.delOneChild(previousPointer, currentPointer);
            } else {
                this.delTwoChild(currentPointer);
            }
        }
    }
}
