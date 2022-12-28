public class Game {
    Node tail;
    int size = 0;

    Game() {
        tail = null;
    }

    public void insert(String player) {
        Node N = new Node(player);
        
        if (tail == null) {
        	tail = N;
        
        }
        
        N.next = tail.next;
        tail.next = N;
        tail = N;
        
    }

    public String playGame() {
        Node curr = tail.next; // first node
        Node prev = tail;

        int random = (int) (Math.random() * 10);
        //System.out.println(random);

        while (curr != prev) {
            for (int i = 0; i < random; i++) {
                prev = curr;
                curr = curr.next;
            }
            //delete the curr node
            prev.next = curr.next;
            if (curr == tail) tail = prev;
            curr = curr.next;
        }
        return tail.name; // winner
    }


    public String toString() {
        return "The Winner of the game is: " + tail.name;
    }
}
