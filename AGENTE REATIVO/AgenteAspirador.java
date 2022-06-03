import java.util.Random;

public class AgenteAspirador {

	public static int local[];

	public static void ambienteVetor() {
		local = new int[2]; 
		for (int i = 0; i < local.length; i++) {
			local[i] = (int) (Math.random() * 2); 
		}
	}

	
	public static void acaoAgente() throws InterruptedException {
    boolean loop = true;
            System.out.println("1- SUJO E 0-LIMPO \n");

		while(loop == true){
            ambienteVetor();
            
            
            System.out.println("[ " + local[0] +","+ local[1] + " ]");
            if (local[0] == 1) {
                System.out.println("\n O Ambiente está Sujo!");
                System.out.println("Limpando...");
                local[0] = 0;
            
            Thread.sleep(10000);

                if (local[0] == 0) {
                    System.out.println("O Ambiente está Limpo!");
                    System.out.println("Indo Para a Direita\n");
                }

            Thread.sleep(10000);

            } else if (local[0] == 0) {

                System.out.println("O Ambiente está Limpo!");
                System.out.println("Indo Para a Direita\n");
            }

            Thread.sleep(10000);

            if (local[1] == 1) {
                System.out.println("[ " + local[0] +","+ local[1] + " ]");
                System.out.println("O Ambiente está Sujo!");

                System.out.println("Limpando...");
                local[1] = 0;
                System.out.println("[ " + local[0] +","+ local[1] + " ]");

                Thread.sleep(10000); 

                if (local[1] == 0) {
                    System.out.println("O Ambiente está Limpo!");
                    System.out.println("Indo Para a Esquerda\n");
                }

                Thread.sleep(10000);

            } else if (local[1] == 0) {
                System.out.println("[ " + local[0] +","+ local[1] + " ]");
                System.out.println("O Ambiente está Limpo!");

                Thread.sleep(10000);

            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        acaoAgente();

    }
}