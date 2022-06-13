package main;
import graph.Grafo;
import graph.Vertice;
import java.util.ArrayList;
import velha.Velha;
import java.util.Scanner;

public class main {
    public static int tabuleiro[][] = {{-1,0,0}, {0,0,0}, {0,0,0}};
    public static ArrayList be = new ArrayList<>();
    public static void main(String[] args) {
        int a;
        int b;
        Grafo g = Velha.g;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Linha");
            a= sc.nextInt();
            System.out.println("Coluna");
            b= sc.nextInt();
            tabuleiro[a][b] = 1;
            System.out.println("tabuleiro main --> ");
            Velha.print(tabuleiro);
            Velha.espaco_busca(tabuleiro, false);
            be.add(g.buscaEmLargura());
            System.out.println(be);
        }
        
    }
}
