package DFS;
public class Buscas {   
    public static void main(String[] args) {

        No no0 = new No(0);
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);

        no0.setNoEsquerda(no1);
        no1.setNoEsquerda(no3);
        no3.setNoEsquerda(no5);
        no5.setNoEsquerda(no2);
        

        DFS bep = new DFS(2);

        bep.buscarResultado(no0);
        bep.exibirTextoResposta();
    }

}
