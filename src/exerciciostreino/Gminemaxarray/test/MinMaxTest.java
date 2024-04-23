package exerciciostreino.Gminemaxarray.test;

import exerciciostreino.Gminemaxarray.dominio.MinMaxArray;

import java.util.Scanner;

public class MinMaxTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] numbers = new int[tamanho];

        System.out.println("Digite os valores que deseja:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Valor %d: ", (i + 1));
            numbers[i] = scanner.nextInt();
        }

        int min = MinMaxArray.findMinArray(numbers);
        int max = MinMaxArray.findMaxArray(numbers);

        System.out.println("Menor valor: " + min);
        System.out.println("Maior valor: " + max);
    }
}
