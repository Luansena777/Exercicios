package praticasjava.comercioeletronico.dominio;

import praticasjava.comercioeletronico.servicos.MetodoPagamento;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private Endereco endereco;
    private List<Pedido> historicoPedidos;

    public Usuario(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        historicoPedidos = new ArrayList<>();
    }
    public void adicionarProdutoNoCarrinho(Produto produto, int quantidade, CarrinhoDeCompras carrinho){
        carrinho.adicionarCarrinho(produto, quantidade);
    }

    public void removerProdutoNoCarrinho(Produto produto, CarrinhoDeCompras carrinhoDeCompras){
        carrinhoDeCompras.removerCarrinho(produto);
    }

    public void realizarPedido(CarrinhoDeCompras carrinho, MetodoPagamento metodoPagamento){
        Pedido pedido = new Pedido(carrinho.getProdutos(), carrinho.getQuantidadeCarrinho(), carrinho.totalCarrinho(), metodoPagamento);
        historicoPedidos.add(pedido);
        pedido.confirmarPedido();
    }
   public void exibirUsuario(){
       System.out.println("Nome: "+ this.nome + ", Email: "+ this.email);
       this.endereco.imprimeEndereco();
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
