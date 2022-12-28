public class Main {

    public static void main(String[] args) {
    	
    	
    	
        DLinkedList<Integer> list = new DLinkedList();

        list.InsertInOrder(5);
        list.InsertInOrder(10);
        list.InsertInOrder(75);
        list.InsertInOrder(79);
        list.InsertInOrder(23);
        list.InsertInOrder(11);


        System.out.println(list);

        list.ReverseList();

        System.out.println(list);

        list.InsertInOrder(-24);
        System.out.println(list);
        
       

    }
}
