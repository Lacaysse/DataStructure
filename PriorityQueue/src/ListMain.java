public class ListMain {
    public static void main(String[] args) {

        ListPriorityQueue<Integer> L = new ListPriorityQueue();

        L.Enqueue(1);
        L.Enqueue(25);
        L.Enqueue(36);
        L.Enqueue(42);
        L.Enqueue(7);
        L.Enqueue(10);

        L.Dequeue();

        System.out.println(L);
        System.out.println(L.isEmpty());
        
    }
}
