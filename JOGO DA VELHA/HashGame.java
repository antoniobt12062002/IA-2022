import java.util.Scanner;

public class HashGame {

    public static void main(String[] args) {
        int a, b;
        PreencheMatriz pm = new PreencheMatriz();
        pm.pMatriz();
        Scanner s = new Scanner(System.in);
        
        Velha v = new Velha();
        char t[][] = new char [3][3];
        Velha.espaco_busca(t, true);
        
        /*while (true) {
            System.out.println("Marcar posição Linha(X): ");
            a = s.nextInt();
            System.out.println("Marcar posição Coluna(X): ");
            b = s.nextInt();
            while(a >= 3 || b >= 3){
                System.out.println("Marcar posição Linha(X): ");
                a = s.nextInt();
                System.out.println("Marcar posição Coluna(X): ");
                b = s.nextInt();
            }
            pm.verificar(a, b, 'X');
            if(pm.isCheio()){
                break;
            }
            pm.percorrer();
            System.out.println("Marcar posição Linha(O): ");
            a = s.nextInt();
            System.out.println("Marcar posição Coluna(O): ");
            b = s.nextInt();
            while(a >= 3 || b >= 3){
                System.out.println("Marcar posição Linha(O): ");
                a = s.nextInt();
                System.out.println("Marcar posição Coluna(O): ");
                b = s.nextInt();
            }
            pm.verificar(a, b, 'O');
            pm.jogadas(a, b, 'O');
            pm.percorrer();
        }
        pm.percorrer();
        */
    }
}
