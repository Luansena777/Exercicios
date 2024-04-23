package exerciciostreino.Dsistemadecomércioeletrônico.dominio;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private Endereco endereco;
    private String email;
    private ArrayList<Produto> produtos;
    private Carrinho carrinhoDeCompra;

    public Usuario(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
       this.produtos = new ArrayList<>();
    }
    public void removerProduto(Produto produto){
        produtos.remove(produto);
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
}
