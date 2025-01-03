package sistemacadastroproduto.test;

import sistemacadastroproduto.dominio.Produto;
import sistemacadastroproduto.dominio.SistemaDeProdutos;

import java.util.Scanner;

public class SistemaProdutosTest {
    public static void main(String[] args) {
        SistemaDeProdutos sistemaDeProdutos = new SistemaDeProdutos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Remover Produto");
            System.out.println("4. Atualizar Produto");
            System.out.println("5. Buscar Produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int qntd = scanner.nextInt();
                    Produto produto = new Produto(nome, preco, qntd);
                    sistemaDeProdutos.adicionarProduto(produto);
                    break;
                case 2:
                    sistemaDeProdutos.listarProdutos();
                    break;
                case 3:
                    System.out.print("Nome do Produto para remover: ");
                    String nomeRemover = scanner.nextLine();
                    sistemaDeProdutos.removerProduto(nomeRemover);
                    break;
                case 4:
                    System.out.print("Nome do produto para atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Novo Preço: ");
                    double novoPreco = scanner.nextDouble();
                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = scanner.nextInt();

                    sistemaDeProdutos.atualizarProduto(nomeAtualizar, novoPreco, novaQuantidade);
                    break;
                case 5:
                    System.out.print("Nome do produto a buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    sistemaDeProdutos.buscarProduto(nomeBuscar);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }
}
