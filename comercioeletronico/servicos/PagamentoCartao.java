package praticasjava.comercioeletronico.servicos;

public class PagamentoCartao implements Pagamento {
    @Override
    public void pagamento(double valor) {
        System.out.format("Pagamento de R$%.2f realizado no cartão.\n", valor);
        System.out.format("Em 10 X R$%.2f sem juros.\n", valor/12);
    }
}
