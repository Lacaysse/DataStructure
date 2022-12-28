public class AdjacencyMatrix {

    private int adjacencyMatrix[][];
    private Vertex vertexList[];
    private int counter = 0;


    public AdjacencyMatrix(int size) {
        vertexList = new Vertex[size];
        adjacencyMatrix = new int[size][size];
    }

    public void addVertex(String label) {

        if (counter >= vertexList.length) {
            System.out.println("Vertex list is Full");
            return;
        }
        vertexList[counter++] = new Vertex(label);
    }

    public int getLabelIndex(String label) {
        for (int i = 0; i < vertexList.length; i++) {
            if (vertexList[i].label.compareTo(label) == 0) {
                return i;
            }
        }
        return -1;
    }


    public void addEdge(String L1, String L2) {

        int indexone = getLabelIndex(L1);
        int indextwo = getLabelIndex(L2);

        if (indexone == -1 || indextwo == -1) {
            System.out.println("Invalid Labels");
            return;
        }
        adjacencyMatrix[indexone][indextwo] = 1;
    }

    public void display() {
        for (Vertex vertex : vertexList) {
            System.out.print(vertex.label);
            System.out.print(" ");
        }

        for (int i = 0; i < vertexList.length; i++) {
            System.out.println();
            for (int j = 0; j < vertexList.length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
        }
    }
}
