public class Hash<T> {

    LinkedList<T>[] Table;
    int size;

    public static void main(String[] args) {

        Hash H = new Hash<Integer>(5);

        H.insert(20);
        H.insert(30);
        H.insert(40);
        H.insert(50);
        H.insert(60);
        
        H.delete(50);

        System.out.println(H.find(20));


        H.displayTable();
    }

    public Hash(int s) {
        size = s + (s / 3);

        Table = new LinkedList[s + (s / 3)];

        for (int i = 0; i < Table.length; i++) {
            Table[i] = new LinkedList<>();
        }
    }

    public int HashT(T obj) {
        return obj.hashCode() % size;
    }

    public void insert(T obj) {

        int i = HashT(obj);

        Table[i].add(obj);
    }

    public Boolean find(T obj) {

        int i = HashT(obj);

        return Table[i].find(obj);
    }

    public void delete(T obj) {

        int i = HashT(obj);

        Table[i].remove(obj);
    }

    public void displayTable() {

        for (int i = 0; i < size; i++) {
            System.out.println(Table[i].toString());
        }
    }
}
