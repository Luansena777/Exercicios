package gerenciamentodepedidosrestaurante.dominio;

import gerenciamentodepedidosrestaurante.servico.Taxavel;

public class PratoPrincipal extends Prato implements Taxavel {

    public PratoPrincipal(String nome, double preco, boolean disponivel) {
        super(nome, preco, disponivel);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Prato Principal: " + nome + " | Preço R$ %.2f\n" , (preco + calculartaxa()));
    }

    @Override
    public double calculartaxa() {
        return getPreco() * 0.05; //Taxa de 5%
    }
}

