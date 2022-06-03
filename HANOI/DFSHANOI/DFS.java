package DFSHANOI;

import java.util.Stack;

public class DFS {
    
    private Stack<No> pilhaNos;

    private String textoResposta;

    private String valorBusca;

    public DFS(String string){
        this.pilhaNos = new Stack<>();

        this.valorBusca = string;
    }

    public boolean isResultadoBusca(No no){
        return no.getValor() == valorBusca;
    }

    public boolean buscarResultado(No no){
        this.pilhaNos.add(no);
        if (isResultadoBusca(no)){
            exibirResultadoPaternal(no);
            return true;
        }else{
            if(no.getNoEsquerda() != null && this.buscarResultado(no.getNoEsquerda())){
                return true;
            }
            if(no.getNoDireita() != null && this.buscarResultado(no.getNoDireita())){
                return true;
            }
        }
        this.pilhaNos.pop();
        return false;
    }

    public void exibirResultadoPaternal(No no){
        String retorno = "";

        No noValor = no;

        retorno += noValor.getValor();

        while(noValor.getNoPai() != null){
            noValor = noValor.getNoPai();
            retorno = noValor.getValor() + " " + retorno;
        }

        this.textoResposta = retorno;

    }

    public void exibirTextoResposta(){
        if(this.textoResposta != null){
            System.out.println("O caminho percorrido será: " +this.textoResposta);
        }else{
            System.out.println("O valor " + this.valorBusca + " não foi encontrado");
        }
    }

}
