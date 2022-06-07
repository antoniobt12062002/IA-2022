import java.util.ArrayList;


public class Velha {

    public static void print(char mat[][]) {
        System.out.println();
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                switch(mat[i][j]) {
                    case 'X':
                        System.out.print('X');
                        break;
                    case ' ':
                        System.out.print((i == mat.length-1 ? " " : "_"));
                        break;
                    case 'O':
                        System.out.print("O");
                        break;
                }
                System.out.print((j == mat[0].length-1 ? "" : "|"));
            }
            System.out.println();
        }
    }

    public static char[][] copy(char m[][]) {
        char aux[][] = new char[m.length][m[0].length];
        for(int i=0; i<aux.length; i++) {
            for(int j=0; j<aux[0].length; j++) {
                aux[i][j] = m[i][j];
            }
        }
        return aux;
    }

    // x = true | o = false
    public static ArrayList<char[][]> exp(char m[][], boolean jogador) {
        ArrayList<char[][]> espaco = new ArrayList<>();
        for(int i = 0; i<m.length; i++) {
            for(int j=0; j<m[0].length; j++) {
                if(m[i][j] == 0) {
                    char aux[][] = Velha.copy(m);
                    aux[i][j] = (jogador ? 'X' : 'O');
                    espaco.add(aux);
                }
            }
        }
        return espaco;
    }

    public static boolean is_fineshed(char m[][]) {
        // tabuleiro cheio
        int count = 0;
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[0].length; j++) {
                if(m[i][j] != 0) {
                    count ++;
                }
            }
        }
        if(count == 9) {
            return true;   
        } else {
            if(m[0][0] != 0 && m[0][0] == m[0][1] && m[0][1] == m[0][2]) {
                return true;
            } else if(m[1][0] != 0 && m[1][0] == m[1][1] && m[1][1] == m[1][2]) {
                return true;
            } else if(m[2][0] != 0 && m[2][0] == m[2][1] && m[2][1] == m[2][2]) {
                return true;
            } else if(m[0][0] != 0 && m[0][0] == m[1][0] && m[1][0] == m[2][0]) {
                return true;
            } else if(m[0][1] != 0 && m[0][1] == m[1][1] && m[1][1] == m[2][1]) {
                return true;
            } else if(m[0][2] != 0 && m[0][2] == m[1][2] && m[1][2] == m[2][2]) {
                return true;
            } else if(m[0][0] != 0 && m[0][0] == m[1][1] && m[1][1] == m[2][2]) {
                return true;
            } else if(m[0][2] != 0 && m[0][2] == m[1][1] && m[1][1] == m[2][0]) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void espaco_busca(char estado[][], boolean jogador) {
        Velha.print(estado);
        if(!Velha.is_fineshed(estado)) {
            ArrayList<char[][]> espaco = Velha.exp(estado, jogador);
            for(char m[][] : espaco) {
                espaco_busca(m, !jogador);
            }
        }
    }
}