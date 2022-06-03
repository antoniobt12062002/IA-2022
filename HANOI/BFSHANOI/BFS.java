package BFSHANOI;

public class BFS {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();

        grafo.adicionarVertice("111");
        grafo.adicionarVertice("112");
        grafo.adicionarVertice("113");
        grafo.adicionarVertice("121");
        grafo.adicionarVertice("122");
        grafo.adicionarVertice("123");
        grafo.adicionarVertice("131");
        grafo.adicionarVertice("132");
        grafo.adicionarVertice("133");
        grafo.adicionarVertice("211");
        grafo.adicionarVertice("212");
        grafo.adicionarVertice("213");
        grafo.adicionarVertice("221");
        grafo.adicionarVertice("222");
        grafo.adicionarVertice("223");
        grafo.adicionarVertice("231");
        grafo.adicionarVertice("232");
        grafo.adicionarVertice("233");
        grafo.adicionarVertice("311");
        grafo.adicionarVertice("312");
        grafo.adicionarVertice("313");
        grafo.adicionarVertice("321");
        grafo.adicionarVertice("322");
        grafo.adicionarVertice("323");
        grafo.adicionarVertice("331");
        grafo.adicionarVertice("332");
        grafo.adicionarVertice("333");



        grafo.adicionarAresta(0.0, "111","112");
        grafo.adicionarAresta(0.0,"111","113");
        grafo.adicionarAresta(0.0,"112","113");
        grafo.adicionarAresta(0.0,"112","132");
        grafo.adicionarAresta(0.0,"132","133");
        grafo.adicionarAresta(0.0,"132","131");
        grafo.adicionarAresta(0.0,"133","131");
        grafo.adicionarAresta(0.0,"131","121");
        grafo.adicionarAresta(0.0,"113","123");
        grafo.adicionarAresta(0.0,"123","121");
        grafo.adicionarAresta(0.0,"123","122");
        grafo.adicionarAresta(0.0,"121","122");
        grafo.adicionarAresta(0.0,"133","233");
        grafo.adicionarAresta(0.0,"233","231");
        grafo.adicionarAresta(0.0,"233","232");
        grafo.adicionarAresta(0.0,"231","232");
        grafo.adicionarAresta(0.0,"122","322");
        grafo.adicionarAresta(0.0,"322","323");
        grafo.adicionarAresta(0.0,"322","321");
        grafo.adicionarAresta(0.0,"323","321");
        grafo.adicionarAresta(0.0,"231","221");
        grafo.adicionarAresta(0.0,"221","222");
        grafo.adicionarAresta(0.0,"221","223");
        grafo.adicionarAresta(0.0,"222","223");
        grafo.adicionarAresta(0.0,"232","212");
        grafo.adicionarAresta(0.0,"212","213");
        grafo.adicionarAresta(0.0,"212","211");
        grafo.adicionarAresta(0.0,"213","211");
        grafo.adicionarAresta(0.0,"223","211");
        grafo.adicionarAresta(0.0,"323","313");
        grafo.adicionarAresta(0.0,"313","311");
        grafo.adicionarAresta(0.0,"313","312");
        grafo.adicionarAresta(0.0,"311","312");
        grafo.adicionarAresta(0.0,"211","311");
        grafo.adicionarAresta(0.0,"321","331");
        grafo.adicionarAresta(0.0,"331","332");
        grafo.adicionarAresta(0.0,"331","333");
        grafo.adicionarAresta(0.0,"312","332");
        grafo.adicionarAresta(0.0,"332","333");

        grafo.buscarEmLargura();

    }
}
