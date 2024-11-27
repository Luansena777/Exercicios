package jogodeadvinhacao.test;


import java.util.Random;
import java.util.Scanner;

public class AdvinhacaoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int min = 1, max = 101;
        double al = Math.random();
        int numPensado = (int) (al * (max - min + 1) + min); // Gera um número aleatório entre 1 e 100

        int palpite = 0;
        int tentativas = 0;


        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 100):");

        while (palpite != numPensado) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numPensado) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numPensado) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
            }
        }

        sc.close();

    }
}
