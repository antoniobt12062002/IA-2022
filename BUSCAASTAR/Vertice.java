package Busca_AStar;
import java.util.ArrayList;
public class Vertice<T> {
    private T d;
    private ArrayList<Edge<T>> edge_1;
    private ArrayList<Edge<T>> edge_2;
    private int g;
    private int h;
    private int f;

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
    public Vertice(T d){
        this.d = d;
        this.edge_1 = new ArrayList<>();
        this.edge_2 = new ArrayList<>();
    }

    public ArrayList<Edge<T>> getEdge_1() {
        return edge_1;
    }

    public void setEdge_1(ArrayList<Edge<T>> edge_1) {
        this.edge_1 = edge_1;
    }

    public ArrayList<Edge<T>> getEdge_2() {
        return edge_2;
    }

    public void setEdge_2(ArrayList<Edge<T>> edge_2) {
        this.edge_2 = edge_2;
    }

    public T getD() {
        return d;
    }

    public void setD(T d) {
        this.d = d;
    }
    public void addEdge1(Edge<T> edge){
        this.edge_1.add(edge);
    }
    public void addEdge2(Edge<T> edge){
        this.edge_2.add(edge);
    }
    
}
