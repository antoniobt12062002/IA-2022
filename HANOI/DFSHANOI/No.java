package DFSHANOI;

public class No {
    
    private No noPai;
    private No noEsquerda;
    private No noDireita;

    private String valor;

    public No(String string){
        this.valor = string;
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

    public String getValor(){
        return valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public No getNoPai(){
        return noPai;
    }

    public void setNoPai(No noPai){
        this.noPai = noPai;
    }
}
