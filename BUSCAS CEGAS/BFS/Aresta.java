package BFS;

public class Aresta<TIPO> {
    private Double peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim){
       this.peso = peso;
       this.inicio = inicio;
       this.fim = fim; 
    }

    public Double getPeso(){
        return peso;
    }

    public void SetPeso(Double peso){
        this.peso = peso;
    }

    public Vertice<TIPO> getInicio(){
        return inicio;
    }

    public void SetInicio(Vertice<TIPO> inicio){
        this.inicio = inicio;
    }

    public Vertice<TIPO> getFim(){
        return fim;
    }
    
    public void SetFim(Vertice<TIPO> fim){
        this.fim = fim ;
    }
    
    
    
}
