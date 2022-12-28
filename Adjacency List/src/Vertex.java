import java.util.LinkedList;

public class Vertex {

    String name;
    int age;

    LinkedList<Vertex> friendsList = new LinkedList<Vertex>();

    Vertex(String d, int a) {
        name = d;
        age = a;
    }
}
