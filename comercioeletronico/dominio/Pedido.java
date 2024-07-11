package praticasjava.comercioeletronico.dominio;

import praticasjava.comercioeletronico.servicos.Pagamento;

import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private List<Integer> quantidadeProdutos;
    private double total;
    private Pagamento metodoDePagamento;

    public Pedido(List<Produto> produtos, List<Integer> quantidadeProdutos, double total, Pagamento metodoDePagamento) {
        this.produtos = produtos;
        this.quantidadeProdutos = quantidadeProdutos;
        this.total = total;
        this.metodoDePagamento = metodoDePagamento;
    }

    public void confirmarPedido() {
        System.out.println("Pedido confirmado");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(quantidadeProdutos.get(i) + " X " + produtos.get(i).getNome());
        }
        System.out.println("Total do Pedido: R$" + getTotal());
        metodoDePagamento.pagamento(total);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Integer> getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(List<Integer> quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public double getTotal() {
        return total;
    }

    public Pagamento getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(Pagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }
}
