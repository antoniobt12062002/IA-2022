package Busca_AStar;
import java.util.ArrayList;
import java.util.List;
public class Grafo<T> {
    private final ArrayList<Vertice<T>> vertex;
    private final ArrayList<Edge<T>> edge;
    
    public Grafo(){
        this.vertex = new ArrayList<>();
        this.edge = new ArrayList<>();
    }
    public Vertice getVertex(int i){
        return this.vertex.get(i);
    }
    public void addVertex(T d){
        Vertice<T> newVertex  =  new Vertice<>(d);
        this.vertex.add(newVertex);
    }
    public void addEdge(double weight, T dStart, T dEnd){
        Vertice<T> start = this.searchVertex(dStart);
        Vertice<T> end = this.searchVertex(dEnd);
        Edge<T> edge = new Edge<>(weight, start, end);
        start.addEdge2(edge);
        end.addEdge1(edge);
        this.edge.add(edge);
    }
    public Vertice<T> searchVertex(T d){
        Vertice<T> v = null;
        for(int i = 0; i < this.vertex.size(); i++){
            if(this.vertex.get(i).getD().equals(d)){
                v = this.vertex.get(i);
                break;
            }
        }
        return v;
    }
    public void AStarAlgorithm(Vertice goal){
        List<Vertice> opened = new ArrayList<>();
        List<Vertice> closed = new ArrayList<>();
        opened.add(this.getVertex(0));
        while(!opened.isEmpty()){
            Vertice<T> current = opened.get(0);
            opened.remove(current);
            closed.add(current);
            if(current.getD() == goal.getD()){
                System.out.println("Caminho Encontrado!");
                System.out.println("Passamos por:");
            }
            Vertice<T> children = current;
            for(int i = 0; i < children.getEdge_2().size(); i++){
                Vertice<T> child = children.getEdge_2().get(i).getEnd();
                if(closed.contains(child)){
                    continue;
                }
                child.setG(current.getG());
                child.setH(current.getH());
                child.setF(child.getG() + child.getH());
                if(opened.contains(child) && child.getG() > 30){
                    continue;
                }
                opened.add(child);
            }
        }
    }
}
