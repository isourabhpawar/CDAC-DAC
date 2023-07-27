public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.display();
        g.dfs(0);
        g.dfs(3);

        g.dfs(0, new int[g.getNoOfVertices()]);
        System.out.println();
        g.dfs(3, new int[g.getNoOfVertices()]);
        System.out.println();

        g.bfs(0);
        g.bfs(4);
    }
}
