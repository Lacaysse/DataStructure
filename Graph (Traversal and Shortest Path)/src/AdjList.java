import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class AdjList {

    Vertex[] G;
    int count;

    AdjList(int s) {
        G = new Vertex[s];
        count = 0;
    }

    public void AddVertex(String n, int a) {
        n = n.toLowerCase();
        if (count < G.length) {
            for (int i = 0; i < count; i++) {
                if (G[i].name.equals(n)) {
                    System.out.println("duplicates");
                    return;
                }
            }
            G[count++] = new Vertex(n, a);
        } else {
            System.out.println("array full");
        }
    }

    public void AddEdge(String n1, String n2) {
        int i, j;
        for (i = 0; i < count; i++) {
            if (G[i] != null && n1.equals(G[i].name)) {
                break;
            }
        }
        for (j = 0; j < count; j++) {
            if (G[j] != null && n2.equals(G[j].name)) {
                break;
            }
        }
        if (i < count && j < count) {
            G[j].friendsList.insert(G[i]);
            G[i].friendsList.insert(G[j]);
        }
    }

    public void deleteVertex(String n) {
        int i = 0;
        for (i = 0; i < count; i++) {
            if (G[i] != null && n.equals(G[i].name)) {
                break;
            }
        }
        LinkedList<Vertex> list = G[i].friendsList;
        int j = 0, k = 0;
        for (j = 0; j < list.size; j++) {
            Vertex v = list.get(j);
            for (k = 0; k < count; k++) {
                if (G[k] != null && G[k] == v) {
                    G[k].friendsList.delete(G[i]);
                    break;
                }

            }

        }
        G[i] = null;
    }

    public void deleteEdge(String n1, String n2) {
        int i, j = 0;                        // (v1,v2)
        for (i = 0; i < count; i++) {
            if (G[i] != null && n1.equals(G[i].name)) {
                break;
            }
        }

        for (j = 0; j < count; j++) {
            if (G[j] != null && n2.equals(G[j].name)) {
                break;
            }
        }

        if (i < count && j < count) {
            G[i].friendsList.delete(G[j]);
            G[j].friendsList.delete(G[i]);
        }
    }

    public Vertex FindVertex(String n) {
        int j = 0;
        for (j = 0; j < count; j++) {
            if (G[j] != null && n.equals(G[j].name)) {
                break;
            }
        }
        return G[j];
    }

    public LinkedList<Vertex> FindVertexFriendsList(String n) {
        int j = 0;
        for (j = 0; j < count; j++) {
            if (G[j] != null && n.equals(G[j].name)) {
                break;
            }
        }
        if (G[j] != null) {
            return G[j].friendsList;
        }
        return null;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < count; i++) {
            if (G[i] == null) {
                str = str + "[" + i + "] " + "null\n";
            } else {
                str = str + "[" + i + "] " + G[i].name + "--" + G[i].friendsList.toString() + "\n";
            }
        }
        return str;
    }

    public void DFS() {
        Stack<Vertex> stk = new Stack<Vertex>();
        Vertex v = G[0];
        v.visit = true;
        stk.push(v);
        System.out.println(" " + v.name);

        while (!stk.isEmpty()) {
            LinkedList<Vertex> L = v.friendsList;
            int i = 0;
            while (i < L.size && L.get(i).visit != false) {
                i++;
            }
            if (i < L.size && L.get(i).visit == false) {
                L.get(i);
                v.visit = true;

                v = L.get(i);
                stk.push(v);
                System.out.println(" " + v.name);

            } else {
                v = stk.pop();
            }
        }
        System.out.println();
    }

    public void BFS() {
        Queue<Vertex> Q = new ArrayDeque<Vertex>();
        Vertex v = G[0];
        v.visit = true;
        Q.add(v);
        System.out.println(" " + v.name);
        while (!Q.isEmpty()) {
            v = Q.remove();
            LinkedList<Vertex> L = v.friendsList;
            for (int i = 0; i < L.size; i++) {
                v = L.get(i);
                if (v.visit == false) {
                    v.visit = true;
                    Q.add(v);
                    System.out.println("" + v.name);
                }
            }
        }
        System.out.println();
    }
}
