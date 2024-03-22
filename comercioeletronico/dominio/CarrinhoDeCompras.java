package praticasjava.comercioeletronico.dominio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private List<Integer> quantidadeCarrinho;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
        this.quantidadeCarrinho = new ArrayList<>();
    }

    public void adicionarCarrinho(Produto produto, int quantidade) {
        produtos.add(produto);
        quantidadeCarrinho.add(quantidade);
    }
    public void removerCarrinho(Produto produto) {
        int index = produtos.indexOf(produto);
        if (index != -1) {
            produtos.remove(index);
            int quantidade = quantidadeCarrinho.remove(index);
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

    public double totalCarrinho() {
        double total = 0;
        for (int i = 0; i < produtos.size(); i++) {
            total = produtos.get(i).getPreco() * quantidadeCarrinho.get(i);
        }
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Integer> getQuantidadeCarrinho() {
        return quantidadeCarrinho;
    }

    public void setQuantidadeCarrinho(List<Integer> quantidadeCarrinho) {
        this.quantidadeCarrinho = quantidadeCarrinho;
    }
}
