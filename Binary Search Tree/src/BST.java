public class BST<T extends Comparable<T>> {

    int count;
    Node<T> Root;
    
    public static void main(String[] args) {
    	
    	BST<Integer> B = new BST<Integer>();
    	
    
    	
    	B.insert(100);
    	B.insert(20);
    	B.insert(40);
    	B.insert(60);
    	B.insert(70);
    	B.insert(500);
    	B.insert(25);
    	
    	B.find(20);
    	B.Traverse();
    	B.TraverseLNR(null);
    	
    }


    public void insert(T d) {

        Node<T> newnode = new Node<T>(d);

        if (Root == null) {
            Root = newnode;
            return;
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
    }


    public Node<T> find(T key) {

        Node<T> Temp = Root;

        while (Temp != null && key.compareTo(Temp.data) == 0) {

            if (key.compareTo(Temp.data) < 0) {
                Temp = Temp.left;

            } else if (key.compareTo(Temp.data) > 0) {
                Temp = Temp.right;
            }
        }

        if (Temp != null && key.compareTo(Temp.data) == 0) {
            return Temp;
        } else return Temp;
    }

    public void Traverse() {

        if (Root == null) {
            System.out.println("The List is Empty!");
            return;
        }

        LinkedQueue<Node> Q = new LinkedQueue<>();
        Q.Enqueue(Root);

        while (!Q.isEmpty()) {
            Node Temp = Q.Dequeue();

            System.out.println(Temp.data.toString());

            if (Temp.left != null) {
                Q.Enqueue((Node) Temp.left.data);
            } else {
                Q.Enqueue((Node) Temp.right.data);
            }
        }
    }

    public void TraverseLNR(Node N) {

        if (N == null) {
            return;
        }

        TraverseLNR(N.left);
        System.out.printf("%s ", N.data);
        TraverseLNR(N.right);
    }
}
