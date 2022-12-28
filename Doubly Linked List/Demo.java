public class Demo {
    public static void main(String[] args) {


        DLinkedList<Integer> DL1 = new DLinkedList<Integer>();
        DLinkedList<String> DL2 = new DLinkedList<String>();
        DLinkedList<Student> DL3 = new DLinkedList<Student>();

        Student student1 = new Student("Faraz", 8);
        Student student2 = new Student("Geralt", 5);
        Student student3 = new Student("Elliot", 9);
        Student student4 = new Student("Darla", 2);

        DL3.InsertInOrder(student1);
        DL3.InsertInOrder(student2);
        DL3.InsertInOrder(student3);
        DL3.InsertInOrder(student4);

        System.out.println(DL3);

    }
}
