public class Main {
    public static void main(String[] args) {


        AdjList Graph = new AdjList(20);
        Graph.AddVertex("Faraz", 23);
        Graph.AddVertex("Hasan", 24);
        Graph.AddVertex("Muneeb", 45);
        Graph.AddVertex("Hadi", 30);
        Graph.AddVertex("Omer", 23);
        Graph.AddVertex("Sohaib", 24);

        Graph.AddVertex("Merlin", 45);
        Graph.AddVertex("Kashif", 30);
        Graph.AddVertex("Linda", 23);
        Graph.AddVertex("Lisa", 24);
        Graph.AddVertex("David", 45);
        Graph.AddVertex("John", 30);
        Graph.AddVertex("Brandon", 23);
        Graph.AddVertex("Abella", 24);
        Graph.AddVertex("Abigail", 45);
        Graph.AddVertex("Towqeer", 30);
        System.out.println(Graph);

        Graph.AddEdge("Merlin", "Bazif");
        Graph.AddEdge("Ammar", "Linda");
        Graph.AddEdge("Moiz", "Lisa");
        Graph.AddEdge("Bazif", "Kashif");

        Graph.AddEdge("Dilbar", "John");
        Graph.AddEdge("Merlin", "Abigail");

        Graph.AddEdge("Kashif", "David");
        Graph.AddEdge("Brandon", "Donald");
        Graph.AddEdge("Towqrrt", "John");
        Graph.AddEdge("Ammar", "Abella");
        Graph.AddEdge("John", "Donald");
        Graph.AddEdge("Bazif", "Towqeer");

        System.out.println(Graph);

        Graph.BFS();
        Graph.DFS();
    }
}

