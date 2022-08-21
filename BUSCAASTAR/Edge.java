package Busca_AStar;
public class Edge<T> {
    private double weight;
    private Vertice<T> start;
    private Vertice<T> end;

    public Edge(double weight, Vertice<T> start, Vertice<T> end) {
        this.weight = weight;
        this.start = start;
        this.end = end;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertice<T> getStart() {
        return start;
    }

    public void setStart(Vertice<T> start) {
        this.start = start;
    }

    public Vertice<T> getEnd() {
        return end;
    }

    public void setEnd(Vertice<T> end) {
        this.end = end;
    }
}
