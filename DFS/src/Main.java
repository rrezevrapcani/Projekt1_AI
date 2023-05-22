public class Main {
    public static void main(String[] args) {
        Grafi g=new Grafi(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);
        System.out.println("Algoritmi Depth-First Search duke filluar nga nyja 0: ");
        g.depthFirst(0);
        System.out.println();
        System.out.println("Algoritmi Depth-First Search duke filluar nga nyja 2: ");
        g.depthFirst(2);
    }
}