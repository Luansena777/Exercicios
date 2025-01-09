package gerenciamentodepedidosrestaurante.dominio;

import gerenciamentodepedidosrestaurante.servico.Taxavel;

public class Sobremesa extends Prato implements Taxavel {
    public Sobremesa(String nome, double preco, boolean disponivel) {
        super(nome, preco, disponivel);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Sobremesa: " + nome + " | Preço R$ %.2f\n", (preco + calculartaxa()));
    }

    @Override
    public double calculartaxa() {
        return getPreco() * 0.05; //Taxa de 5%
    }
}
