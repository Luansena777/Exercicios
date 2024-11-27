package sistemacadastroproduto.dominio;

import java.util.ArrayList;

public class SistemaDeProdutos {
    private ArrayList<Produto> listaDeProdutos;

    public SistemaDeProdutos() {
        this.listaDeProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        for (Produto p : listaDeProdutos) { //Verifica se ja existe produto cadastrado com o mesmo nome.
            if (produto.getNome().equalsIgnoreCase(p.getNome())) {
                System.out.println("Produto já cadastrado.");
            }
        }
        listaDeProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso.");
    }

    public void removerProduto(String nome) {
        Produto produtoEncontrado = null;
        for (Produto produto : listaDeProdutos) {//Procura e armazena o produto na variavel se o nome for igual.
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            listaDeProdutos.remove(produtoEncontrado);
            System.out.println(" Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void listarProdutos() {
        if (listaDeProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        }
        int indice = 1;
        for (Produto produto : listaDeProdutos) {
            System.out.print(indice++ + ". ");
            produto.exibirDetalhes();
        }
    }

    public void atualizarProduto(String nome, double novoPreco, int novaQuantidade) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setPreco(novoPreco);
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");

    }

    public void buscarProduto(String nome) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
               produto.exibirDetalhes();
               return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
