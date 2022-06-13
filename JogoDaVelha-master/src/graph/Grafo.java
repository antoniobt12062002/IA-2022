package graph;
import java.util.Scanner;
import main.main;
import java.util.ArrayList;
import velha.Velha;
import graph.Vertice;
import velha.condicao;

public class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;
    Scanner sc = new Scanner(System.in);
    public Grafo(){
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }
    public void removeVertices(){
        this.vertices.forEach((Vertice<TIPO> e) -> {
            e.setDado(null);
        });
    }
    public void removeArestas(){
        this.arestas.forEach(e -> {e.setFim(null); e.setInicio(null); e.setPeso(null);});
        
    }
    public int size(){
        return this.vertices.size();
    }
    public void adicionarVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }
    
    public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    
    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for(int i=0; i < this.vertices.size(); i++){
            if (this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    
    public ArrayList<ArrayList<Vertice<TIPO>>> buscaEmLargura(){
        ArrayList<Vertice<TIPO>> node;
        ArrayList<ArrayList<Vertice<TIPO>>> fila = new ArrayList<>();
        ArrayList<ArrayList<Vertice<TIPO>>> caminho = new ArrayList<>();
        
        Vertice<TIPO> atual = this.vertices.get(0);
        
        ArrayList tmp = new ArrayList<>();
        tmp.add(atual);
        fila.add(tmp);
        while(!fila.isEmpty()){
            caminho.add(fila.get(0));
            node = caminho.get(caminho.size()-1);
            if(condicao.haGanhador((int[][]) atual.getDado())== -1){
                if (node == atual.getDado()){
                    return caminho;
                }
            }
            for(int i = 0; i < this.vertices.size(); i++){
                ArrayList<Vertice<TIPO>> novoCaminho = new ArrayList<>();
                novoCaminho.add(this.vertices.get(i));
                fila.add(novoCaminho);
            }
            System.out.println("To rodando crai");
            fila.remove(0);
        }
        return null;
    }
}