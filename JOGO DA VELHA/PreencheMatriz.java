import java.util.Scanner;

public class PreencheMatriz {
    Scanner s = new Scanner(System.in);
    char t[][] = new char[3][3];
    Velha velha = new Velha();
    public PreencheMatriz() {

    }

    public void jogadas(int a, int b, char jogador) {
        this.t[a][b] = jogador;
        boolean j = (jogador == 'X');
        Velha.espaco_busca(t, j);
    }

    public void verificar(int a, int b, char c) {
        if(!this.isP(a, b)){
            this.jogadas(a, b, c);
        } else {
            while(this.isP(a, b)){
                while(a >= 3 || b >= 3){
                    System.out.println("Posição já preenchida! ");
                    System.out.println("Marcar posição Linha (" + c + "): ");
                    a = s.nextInt();
                    System.out.println("Marcar posição Coluna (" + c + "): ");
                    b = s.nextInt();
                }
            }
            this.jogadas(a, b, c);
        }
    }

    public void pMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = ' ';
                System.out.print("[" + t[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public void percorrer() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + t[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public boolean isP(int a, int b) {
        return this.t[a][b] == 'O' || this.t[a][b] == 'X';
    }
    
    public boolean isCheio(){
        int c = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(t[i][j] == 'O' || t[i][j] == 'X'){
                    c++;
                }
            }
        }
        return c == 9;
    }

    public boolean verificarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }
}
