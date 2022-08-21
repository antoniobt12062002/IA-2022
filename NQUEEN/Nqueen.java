import java.util.ArrayList;
import java.util.Collections;

public class Nqueen {
	private int[][] estadoInicial;

	public Nqueen() {
		/*
		estadoInicial = new int[][] {
				{ 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0 }, 
				{ 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0, 1 }, 
				{ 0, 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 } };*/
		
		estadoInicial = criaTabuleiroAleatorio();
	}

	public Node vizinho(int[][] no) {
		ArrayList<Node> sucessores = new ArrayList<Node>();
		int posL = 0, posC = 0;
		int[][] copiaNo = clonaMatriz(no);
		Node resultado = null;

		for (int coluna = 0; coluna < no.length; coluna++) {
			for (int linha = 0; linha < no.length; linha++) {
				if (copiaNo[linha][coluna] == 1) {
					copiaNo[linha][coluna] = 0;
					posL = linha;
					posC = coluna;
					break;
				}
			}

			for (int linha = 0; linha < no.length; linha++) {
				if ( (linha != posL) || (coluna != posC)) {
					copiaNo[linha][coluna] = 1;
					int[][] novaMatriz = clonaMatriz(copiaNo); 
					Node sucessor = new Node(novaMatriz, calculaValor(copiaNo));
					sucessores.add(sucessor);
					copiaNo[linha][coluna] = 0;
				}
			}
			copiaNo[posL][posC] = 1;
		}
						
		if ( sucessores.size() > 0){
			Collections.sort(sucessores);
			int menorValor = sucessores.get(0).getValor();					
			
			ArrayList<Node> resultados = new ArrayList<Node>();
			for (Node r : sucessores) {
				if ( r.getValor() == menorValor){
					resultados.add(r);
				}
			}
			Collections.shuffle(resultados);
			resultado = resultados.get(0);
		}

		return resultado;
	}
	
	public int calculaValor(int[][] estado) {
		int valor = 0;
		int posL = 0, posC = 0;
		int tamanho = estado.length;

		for (int coluna = 0; coluna < estado.length; coluna++) {
			for (int linha = 0; linha < estado.length; linha++) {
				if (estado[linha][coluna] == 1) {
					posL = linha;
					posC = coluna;
					break;
				}
			}

			for (int i = 1; i < tamanho; i++) {
				if ( ( ( (posL - i) >= 0) && (posC + i) < tamanho)
						&& estado[posL - i][posC + i] == 1) {
					valor += 1;
				}
				if ((((posL + i) < tamanho) && (posC + i) < tamanho)
						&& estado[posL + i][posC + i] == 1) {
					valor += 1;
				}
				if (((posC + i) < tamanho) && estado[posL][posC + i] == 1) {
					valor += 1;
				}
			}

		}

		return valor;
	}

	public int[][] getEstadoInicial() {
		return this.clonaMatriz(estadoInicial);
	}

	public void setEstadoInicial(int[][] estadoInicial) {
		this.estadoInicial = estadoInicial;
	}

	public int[][] clonaMatriz(int[][] list) {
		int[][] clone = new int[list.length][list.length];

		for (int linha = 0; linha < list.length; linha++) {

			for (int coluna = 0; coluna < list.length; coluna++) {
				clone[linha][coluna] = list[linha][coluna];
			}
		}

		return clone;
	}
	
	private int[][] criaTabuleiroAleatorio(){
		int[][] tabuleiro = new int[8][8];		
		int linha;
		
		for(int coluna = 0; coluna < tabuleiro.length; coluna ++){
			
			linha = (int) (0 + Math.random() * tabuleiro.length);;
			tabuleiro[linha][coluna] = 1;
		}
		
		return tabuleiro;
	}

	public Node vizinhoAleatorio(int[][] no) {
		ArrayList<Node> sucessores = new ArrayList<Node>();
		int posL = 0, posC = 0;
		int[][] copiaNo = clonaMatriz(no);
		Node resultado = null;

		for (int coluna = 0; coluna < no.length; coluna++) {
			for (int linha = 0; linha < no.length; linha++) {
				if (copiaNo[linha][coluna] == 1) {
					copiaNo[linha][coluna] = 0;
					posL = linha;
					posC = coluna;
					break;
				}
			}

			for (int linha = 0; linha < no.length; linha++) {
				if ( (linha != posL) || (coluna != posC)) {
					copiaNo[linha][coluna] = 1;
					int[][] novaMatriz = clonaMatriz(copiaNo); 
					Node sucessor = new Node(novaMatriz, calculaValor(copiaNo));
					sucessores.add(sucessor);
					copiaNo[linha][coluna] = 0;
				}
			}
			copiaNo[posL][posC] = 1;
		}
						
		if ( sucessores.size() > 0){
			Collections.sort(sucessores);
			resultado = sucessores.get(0);
		}

		return resultado;
	}

}
