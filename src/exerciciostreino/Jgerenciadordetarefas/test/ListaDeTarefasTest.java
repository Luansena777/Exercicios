package exerciciostreino.Jgerenciadordetarefas.test;

import exerciciostreino.Jgerenciadordetarefas.dominio.GerenciadorDeTarefa;

import java.util.Scanner;

public class ListaDeTarefasTest {
    public static void main(String[] args) {
        GerenciadorDeTarefa listaTarefas = new GerenciadorDeTarefa();
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Adicionar tarefas");
            System.out.println("2. Exibir tarefas");
            System.out.println("3. Marcar com concluída");
            System.out.println("0. sair");

            System.out.print("Escolha uma opção: ");
            menu = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner


            switch (menu) {
                case 1:
                    System.out.println("Digite a descrição da tarefa:");
                    String descricao = scanner.nextLine();
                    listaTarefas.addTasks(descricao);
                    break;
                case 2:
                    System.out.println();
                    listaTarefas.mostrarTasks();
                    break;
                case 3:
                    System.out.print("Insira o indice da tarefa: ");
                    int indice = scanner.nextInt();
                    listaTarefas.marcarComocompletado(indice);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (menu != 0);
        scanner.close();
    }
}
