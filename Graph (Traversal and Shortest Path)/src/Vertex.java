public class Vertex {
    String name;
    int age;
    boolean visit;
    LinkedList<Vertex> friendsList = new LinkedList<Vertex>();

    Vertex(String data, int num) {
        this.name = data;
        this.age = num;
    }

    public String toString() {
        return this.name;
    }
}
