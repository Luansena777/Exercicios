package exerciciostreino.Dsistemadecomércioeletrônico.dominio;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private ArrayList<Produto> produtos;
    private List<Integer> quantidades = new ArrayList<>();
    private ArrayList<Usuario> usuarios;

    public Carrinho() {
        this.produtos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
        System.out.println(quantidade + " " + produto.getNome() + " adicionado(s) no carrinho.");

    }

    public void removerProduto(Produto produto) {
        int index = produtos.indexOf(produto);
        if (index != -1) {
            produtos.remove(index);
            int quantidade = quantidades.remove(index);
            System.out.println(quantidade + " " + produto.getNome() + "(s) removido(s) do carrinho.");
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

    public double totalCarrinho(){
        double total = 0;
        for (int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).getPreco() * quantidades.get(i);
        }
        return total;
    }

}
