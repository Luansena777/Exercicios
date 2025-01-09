package gerenciamentodepedidosrestaurante.dominio;

import gerenciamentodepedidosrestaurante.servico.Taxavel;

public class Bebida extends Prato implements Taxavel {

    public Bebida(String nome, double preco, boolean disponivel) {
        super(nome, preco, disponivel);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Bebida: " + nome + " | Preço R$ %.2f\n", (preco + calculartaxa()));
    }

    @Override
    public double calculartaxa() {
        return getPreco() * 0.1; //Taxa de 10%
    }
}
