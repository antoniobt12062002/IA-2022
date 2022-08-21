package Busca_AStar;

public class AStar {
    public static void main(String[] args) {
        Grafo g = new Grafo();
        g.addVertex("C");
        g.addVertex("A");
        g.addVertex("S");
        g.addVertex("L");
        g.addVertex("U");
        g.addVertex("Z");

        
        g.addEdge(5, "C", "A");
        g.addEdge(12, "S", "L");
        g.addEdge(34, "U", "Z");
        Busca s = new Busca(g);
        g.AStarAlgorithm(g.getVertex(1));
        
    }
    
}
