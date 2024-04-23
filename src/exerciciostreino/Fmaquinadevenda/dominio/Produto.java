package exerciciostreino.Fmaquinadevenda.dominio;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int quantDisponivel;

    public Produto(String nome, String descricao, double preco, int quantDisponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantDisponivel = quantDisponivel;

        if (preco <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
    }

    public void exibirProduto() {
        System.out.println("Produto: " + this.nome +
                ", Descrição: " + this.descricao +
                ", Preço: R$" + this.preco +
                ", Quantidade Disponível: " + this.quantDisponivel);
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
        if (preco <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.preco = preco;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        if (quantDisponivel <= 0){
            throw new IllegalArgumentException("Quantidade inválida");
        }
        this.quantDisponivel = quantDisponivel;
    }
}
