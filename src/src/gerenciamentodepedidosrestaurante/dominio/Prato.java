package gerenciamentodepedidosrestaurante.dominio;

import java.util.Locale;

public abstract class Prato {
    protected String nome;
    protected double preco;
    protected boolean disponivel;

    public Prato(String nome, double preco, boolean disponivel) {
        this.nome = nome.toUpperCase().replace('-', ' ');
        if (preco < 0) {
            throw new IllegalArgumentException("Valor negativo nao permitido. Insira um valor válido.");
        }
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public abstract void exibirDetalhes();

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
