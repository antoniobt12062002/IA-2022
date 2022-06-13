package velha;

public class condicao {

    public static int haGanhador(int tabuleiro[][]) {
        //Checa X verticalmente
        if (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') {
            System.out.println("'X' VENCEU");
            return 1;
        } else if (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') {
            System.out.println("'X' VENCEU");
            return 1;
        } else if (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println("'X' VENCEU");
            return 1;
        } //Checa X horizontalmente
        else if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') {
            System.out.println("'X' VENCEU");
            return 1;
        } else if (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') {
            System.out.println("'X' VENCEU");
            return 1;
        } else if (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println("'X' VENCEU");
            return 1;
        } //Checa X diagonalmente
        else if (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println("'X' VENCEU");
            return 1;
        } else if (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X') {
            System.out.println("'X' VENCEU");
            return 1;
        }
        //Checa O verticalmente
        if (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') {
            System.out.println("'O' VENCEU");
            return -1;
        } else if (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') {
            System.out.println("'O' VENCEU");
            return -1;
        } else if (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println("'O' VENCEU");
            return -1;
        }

        //Checa O horizontalmente
        if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') {
            System.out.println("'O' VENCEU");
            return -1;
        } else if (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') {
            System.out.println("'O' VENCEU");
            return -1;
        } else if (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println("'O' VENCEU");
            return -1;
        }

        //Checa O diagonalmente
        if (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println("'O' VENCEU");
            return -1;
        } else if (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') {
            System.out.println("'O' VENCEU");
            return -1;
        }

        return 0;
    }

}
