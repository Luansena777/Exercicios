package praticasjava.Desafios.dominio;

import java.util.Scanner;

public class JogoDaVelha {
    private char[][] tabuleiro;
    private char jogadorAtual;

    public JogoDaVelha() {
        tabuleiro = new char[3][3];
        jogadorAtual = 'X';
        inicializartabuleiro();
    }

    public void inicializartabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    public void jogar() {
        Scanner input = new Scanner(System.in);
        boolean jogoEmAndamento = true;

        while (jogoEmAndamento) {
            exibirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", faça sua jogada (linha [1-3] coluna [1-3]):");
            int linha = input.nextInt() - 1;
            int coluna = input.nextInt() - 1;

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') {
                tabuleiro[linha][coluna] = jogadorAtual;

                if (verificarVitoria() || verificarEmpate()) {
                    exibirTabuleiro();
                    jogoEmAndamento = false;
                    System.out.println("Fim de jogo!");
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X'; // Alternar entre jogadores
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }

        input.close();
    }

    private boolean verificarVitoria() {
        // Verificar linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != '-' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2]) {
                return true; // Verificar linhas
            }
            if (tabuleiro[0][i] != '-' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[0][i] == tabuleiro[2][i]) {
                return true; // Verificar colunas
            }
        }
        if (tabuleiro[0][0] != '-' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2]) {
            return true; // Verificar diagonal principal
        }
        if (tabuleiro[0][2] != '-' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] == tabuleiro[2][0]) {
            return true; // Verificar diagonal secundária
        }
        return false;
    }

    private boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false; // Se houver qualquer espaço vazio, não é um empate
                }
            }
        }
        return true; // Se não houver espaços vazios, é um empate
    }


    public void exibirTabuleiro() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print((tabuleiro[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
