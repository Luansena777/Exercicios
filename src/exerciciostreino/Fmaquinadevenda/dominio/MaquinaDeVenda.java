package exerciciostreino.Fmaquinadevenda.dominio;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDeVenda {
    private List<Produto> produtoList;

    public MaquinaDeVenda() {
        this.produtoList = new ArrayList<>();
    }

    public void adicinarProduto(Produto produto) {
        produtoList.add(produto);
    }

    public void exibirProdutos() {
        for (int i = 0; i < produtoList.size(); i++) {
            System.out.println((i + 1) + " - " + produtoList.get(i).getNome() + " "
                    + produtoList.get(i).getDescricao() + " R$" + produtoList.get(i).getPreco() + ", " + produtoList.get(i).getQuantDisponivel() + " un. disponível");
        }
    }

    public void compraProduto(Produto produto, int quantidade) {
        if (quantidade > produto.getQuantDisponivel()) {
            throw new IllegalArgumentException("Qauntidade indisponível");
        }
        double totalCompra = produto.getPreco() * quantidade;

        System.out.println("Carrinho");
        System.out.println(quantidade + " X " + produto.getNome() + " " + produto.getDescricao() + " = " + totalCompra);
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}
