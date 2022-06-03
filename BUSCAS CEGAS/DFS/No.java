package DFS;

public class No {
    
    private No noPai;
    private No noEsquerda;
    private No noDireita;

    private int valor;

    public No(int valor){
        this.valor = valor;
    }

    public No getNoEsquerda(){
        return noEsquerda;
    }

    public void setNoEsquerda(No NoEsquerda){
        this.noEsquerda = NoEsquerda;
        this.noEsquerda.setNoPai(this);
    }

    public No getNoDireita(){
        return noDireita;
    }

    public void setNoDireita(No noDireita){
        this.noDireita = noDireita;
        this.noDireita.setNoPai(this);
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public No getNoPai(){
        return noPai;
    }

    public void setNoPai(No noPai){
        this.noPai = noPai;
    }
}
