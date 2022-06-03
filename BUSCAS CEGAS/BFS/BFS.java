package BFS;

public class BFS {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Marcos");
        grafo.adicionarVertice("Antonio");
        grafo.adicionarVertice("Jonas");
        grafo.adicionarVertice("Victor");

        grafo.adicionarAresta(2.0, "João", "Marcos");
        grafo.adicionarAresta(3.0, "Marcos", "Jonas");
        grafo.adicionarAresta(1.0, "Jonas", "Antonio");
        grafo.adicionarAresta(1.0, "João", "Antonio");
        grafo.adicionarAresta(2.0, "Victor", "Marcos");
        grafo.adicionarAresta(3.0, "Victor", "João");

        grafo.buscarEmLargura();

    }
}
