package praticasjava.comercioeletronico.dominio;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int quantDisponivel;
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, String descricao, double preco, int quantDisponivel, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantDisponivel = quantDisponivel;
        this.categoria = categoria;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + this.nome + ", Descrição: " + this.descricao +
                           ", Preço: R$" + this.preco + ", Unidades: " + this.quantDisponivel + ", Categoria: " + categoria);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
