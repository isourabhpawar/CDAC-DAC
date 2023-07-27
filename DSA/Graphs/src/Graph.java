import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
    private char [] vertices;
    private int [][] adjMat;
    private int noOfVertices;

    public Graph(int noOfVertices) {
        this.noOfVertices = noOfVertices;
        vertices = new char[noOfVertices];
        adjMat = new int[noOfVertices][noOfVertices];

        init();
    }

    private void init() {

        for(int i = 0; i < noOfVertices; i++) {
            vertices[i] = (char)(65 + i);
        }
        int arr[] = {0,1,1,0,0,0,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0};
        int k = 0;
        for(int i = 0; i < noOfVertices; i++) {
            for(int j = 0; j < noOfVertices; j++) {
                adjMat[i][j] = arr[k++];
            }
        }

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for vertices");
        for(int i = 0; i < noOfVertices; i++) {
            System.out.println("Vertex " + i + ":" );
            vertices[i] = scanner.next().charAt(0);
        }

        System.out.println("Enter info about edges: ");
        for(int i = 0; i < noOfVertices; i++) {
            for(int j = 0; j < noOfVertices; j++) {
                System.out.println("Edge betwn " + vertices[i] + " & " + vertices[j]);
                adjMat[i][j] = scanner.nextInt();
            }
        }*/
    }

    public void display() {
        System.out.print("  ");
        for(int i = 0; i < noOfVertices; i++) {
            System.out.print(vertices[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < noOfVertices; i++) {
            System.out.print(vertices[i] + " ");
            for (int j = 0; j < noOfVertices; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int v) {
        int [] visited = new int[noOfVertices];
        Stack<Integer> stack = new Stack<>();

        System.out.println("DFS: ");
        System.out.print(vertices[v] + " ");
        visited[v] = 1;
        stack.push(v);

        while(!stack.empty()) {

            for(int i = 0; i < noOfVertices; i++) {
                if(adjMat[v][i] == 1 && visited[i] == 0) {
                    System.out.print(vertices[i] + " ");
                    visited[i] = 1;
                    stack.push(i);

                    v = i; //* v holds the vertex on top of stack
                    i = -1; //reset i to 0
                 }
            }

            //no unvisited adj to v is found
            stack.pop();
            if(!stack.empty()) {
                v = stack.peek();
            }
        }
        System.out.println();
    }

    public void dfs(int v, int [] visited) {
        if( visited[v] == 0) {
            System.out.print(vertices[v] + " ");
            visited[v] = 1;
            for(int i = 0; i < noOfVertices; i++) {
                if(adjMat[v][i] == 1 && visited[i] == 0) {
                    dfs(i, visited);
                }
            }
        }
    }

    public int getNoOfVertices() {
        return noOfVertices;
    }

    public void bfs(int v) {
        int [] visited = new int[noOfVertices];
        LinkedList<Integer> queue = new LinkedList<>();

        System.out.print("BFS: ");
        queue.addLast(v);

        while(!queue.isEmpty()) {
            v = queue.removeFirst();
            if(visited[v] == 0) {
                System.out.print(vertices[v] + " ");
                visited[v] = 1;
                for(int i = 0; i < noOfVertices; i++) {
                    if(adjMat[v][i] == 1 && visited[i] == 0) {
                        queue.addLast(i);
                    }
                }
            }
        }
        System.out.println();
    }
}
