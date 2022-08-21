public class BuscaGulosa {

    public static void main(String[] args) {
        Graph<String> g = new Graph<>();
        g.addVertex("Cascavel");
        g.addVertex("Londrina");
        g.addVertex("Apucarana");
        g.addVertex("Campo Mourão");

        g.addEdge(5, "Cascavel", "Apucarana");
        g.addEdge(2, "Cascavel", "Londrina");
        g.addEdge(8, "Londrina", "Apucarana");
        g.addEdge(2, "Londrina", "Campo Mourão");

        Busca BGL = new Busca(g);
        int r = BGL.gSearch(3);
    }
}
