package BFSHANOI;

public class BFS {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();

        grafo.adicionarVertice("111");
        grafo.adicionarVertice("311");
        grafo.adicionarVertice("311");
        grafo.adicionarVertice("331");
        grafo.adicionarVertice("331");
        grafo.adicionarVertice("131");
        grafo.adicionarVertice("131");
        grafo.adicionarVertice("331");
        grafo.adicionarVertice("331");
        grafo.adicionarVertice("333");
        grafo.adicionarVertice("333");
        grafo.adicionarVertice("333");
        grafo.adicionarVertice("333");
        grafo.adicionarVertice("133");   
        grafo.adicionarVertice("133");
        grafo.adicionarVertice("133");
        grafo.adicionarVertice("133");
        grafo.adicionarVertice("333");
        grafo.adicionarVertice("333");
        grafo.adicionarVertice("333");
        grafo.adicionarVertice("333");
        grafo.adicionarVertice("313");
        grafo.adicionarVertice("313");
        grafo.adicionarVertice("313");
        grafo.adicionarVertice("313");
        grafo.adicionarVertice("133");
        grafo.adicionarVertice("113");



        grafo.adicionarAresta(1.0,"111","113");
        grafo.adicionarAresta(1.0,"113","113");
        grafo.adicionarAresta(1.0,"113","113");
        grafo.adicionarAresta(1.0,"113","133");
        grafo.adicionarAresta(1.0,"133","133");
        grafo.adicionarAresta(1.0,"133","131");
        grafo.adicionarAresta(1.0,"133","131");
        grafo.adicionarAresta(1.0,"131","131");
        grafo.adicionarAresta(1.0,"113","133");
        grafo.adicionarAresta(1.0,"133","131");
        grafo.adicionarAresta(1.0,"133","133");
        grafo.adicionarAresta(1.0,"131","133");
        grafo.adicionarAresta(1.0,"133","333");
        grafo.adicionarAresta(1.0,"333","331");
        grafo.adicionarAresta(1.0,"333","333");
        grafo.adicionarAresta(1.0,"331","333");
        grafo.adicionarAresta(1.0,"133","333");
        grafo.adicionarAresta(1.0,"333","333");
        grafo.adicionarAresta(1.0,"333","331");
        grafo.adicionarAresta(1.0,"333","331");
        grafo.adicionarAresta(1.0,"331","331");
        grafo.adicionarAresta(1.0,"331","333");
        grafo.adicionarAresta(1.0,"331","333");
        grafo.adicionarAresta(1.0,"333","333");
        grafo.adicionarAresta(1.0,"333","313");
        grafo.adicionarAresta(1.0,"313","313");
        grafo.adicionarAresta(1.0,"313","311");
        grafo.adicionarAresta(1.0,"313","311");
        grafo.adicionarAresta(1.0,"333","311");
        grafo.adicionarAresta(1.0,"333","313");
        grafo.adicionarAresta(1.0,"313","311");
        grafo.adicionarAresta(1.0,"313","313");
        grafo.adicionarAresta(1.0,"311","313");
        grafo.adicionarAresta(1.0,"311","311");
        grafo.adicionarAresta(1.0,"331","331");
        grafo.adicionarAresta(1.0,"331","333");
        grafo.adicionarAresta(1.0,"331","333");
        grafo.adicionarAresta(1.0,"313","333");
        grafo.adicionarAresta(1.0,"333","333");

        /*    grafo.adicionarVertice("aaa");
        grafo.adicionarVertice("baa");
        grafo.adicionarVertice("caa");
        grafo.adicionarVertice("bca");
        grafo.adicionarVertice("cba");
        grafo.adicionarVertice("aca");
        grafo.adicionarVertice("aba");
        grafo.adicionarVertice("cca");
        grafo.adicionarVertice("bba");
        grafo.adicionarVertice("ccb");
        grafo.adicionarVertice("bbc");
        grafo.adicionarVertice("bcb");
        grafo.adicionarVertice("cbc");
        grafo.adicionarVertice("acb");   
        grafo.adicionarVertice("abc");
        grafo.adicionarVertice("abb");
        grafo.adicionarVertice("acc");
        grafo.adicionarVertice("bbb");
        grafo.adicionarVertice("ccc");
        grafo.adicionarVertice("cbb");
        grafo.adicionarVertice("bcc");
        grafo.adicionarVertice("cab");
        grafo.adicionarVertice("bac");
        grafo.adicionarVertice("bab");
        grafo.adicionarVertice("cac");
        grafo.adicionarVertice("acc");
        grafo.adicionarVertice("aab");



        grafo.adicionarAresta(0.0,"aaa","aab");
        grafo.adicionarAresta(0.0,"aab","aab");
        grafo.adicionarAresta(0.0,"aab","aac");
        grafo.adicionarAresta(0.0,"aab","acb");
        grafo.adicionarAresta(0.0,"acb","acc");
        grafo.adicionarAresta(0.0,"acb","aca");
        grafo.adicionarAresta(0.0,"acc","aca");
        grafo.adicionarAresta(0.0,"aca","aba");
        grafo.adicionarAresta(0.0,"aac","abc");
        grafo.adicionarAresta(0.0,"abc","aba");
        grafo.adicionarAresta(0.0,"abc","abb");
        grafo.adicionarAresta(0.0,"aba","abb");
        grafo.adicionarAresta(0.0,"acc","bcc");
        grafo.adicionarAresta(0.0,"bcc","bca");
        grafo.adicionarAresta(0.0,"bcc","bcb");
        grafo.adicionarAresta(0.0,"bca","bcb");
        grafo.adicionarAresta(0.0,"abb","cbb");
        grafo.adicionarAresta(0.0,"cbb","cbc");
        grafo.adicionarAresta(0.0,"cbb","cba");
        grafo.adicionarAresta(0.0,"cbc","cba");
        grafo.adicionarAresta(0.0,"bca","bba");
        grafo.adicionarAresta(0.0,"bba","bbb");
        grafo.adicionarAresta(0.0,"bba","bbc");
        grafo.adicionarAresta(0.0,"bbb","bbc");
        grafo.adicionarAresta(0.0,"bcb","bab");
        grafo.adicionarAresta(0.0,"bab","bac");
        grafo.adicionarAresta(0.0,"bab","baa");
        grafo.adicionarAresta(0.0,"bac","baa");
        grafo.adicionarAresta(0.0,"bbc","baa");
        grafo.adicionarAresta(0.0,"cbc","cac");
        grafo.adicionarAresta(0.0,"cac","caa");
        grafo.adicionarAresta(0.0,"cac","cab");
        grafo.adicionarAresta(0.0,"caa","cab");
        grafo.adicionarAresta(0.0,"baa","caa");
        grafo.adicionarAresta(0.0,"cba","cca");
        grafo.adicionarAresta(0.0,"cca","ccb");
        grafo.adicionarAresta(0.0,"cca","ccc");
        grafo.adicionarAresta(0.0,"cab","ccb");
        grafo.adicionarAresta(0.0,"ccb","ccc");*/


        grafo.buscarEmLargura();

    }
}
