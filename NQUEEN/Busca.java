public class Busca {
	private Nqueen problema;
	
	public Busca(Nqueen problema){
		this.problema = problema;
	}
	
	public Node subida_da_encosta(){
		
		int[][] estado = problema.getEstadoInicial();
		int valor = problema.calculaValor(estado); 
		Node corrente = new Node(estado, valor);
		
		Node vizinho;
		
		int passos = 0;
		while (true){
			vizinho = problema.vizinho(corrente.getEstado());
			
			
			
			if( vizinho.getValor() >= corrente.getValor()){
				System.out.println("Passos " + passos);
				return corrente;
			}
			
			corrente = vizinho;
			passos++;
			
		}
				
	}

	public Node tempera_simulada(double tolerancia, double temp) {
		
		 
		int[][] estado = problema.getEstadoInicial();
		int valor = problema.calculaValor(estado); 
		Node corrente = new Node(estado, valor);
		
		Node vizinho = null;
		
		int passos = 0;
		while (corrente.getValor()!=0 && passos < 1000) {
            double temperatura;
            double delta;
            double probabilidade;
            double randomico;


            for (temperatura = temp; (temperatura > 0) && (corrente.getValor() != 0); temperatura--) {
                vizinho = problema.vizinho(corrente.getEstado());
                delta = corrente.getValor() - vizinho.getValor();
                probabilidade = Math.exp(delta / temperatura);
                randomico = Math.random();

                if (delta > 0) {
                    corrente = vizinho;
                } else if (randomico <= probabilidade) {
                    corrente = vizinho;
                }
                
                passos++;
            }
        }
		System.out.println("Passos " + passos);		
		return corrente;
	}
}
