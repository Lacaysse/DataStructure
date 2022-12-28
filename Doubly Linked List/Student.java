public class Student implements Comparable<Student> {

    String name;
    int id;


    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {

        return "The Student Name is: " + name + ", and the Student ID is: " + id + "\n";
    }


    public int compareTo(Student Other) {
        if (Other == null) {
            return 1;
        }
        if (this.id > Other.id) return 1;

        else if (this.id < Other.id) return -1;

        else return 0;

    }
}
