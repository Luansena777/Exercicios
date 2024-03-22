package praticasjava.comercioeletronico.servicos;

public class PagamentoBoleto implements MetodoPagamento {
    private final double DESCONTO_BOLETO = 0.05;

    @Override
    public void pagamento(double valor) {
        double desconto = valor - (valor * DESCONTO_BOLETO);
        System.out.println("5% de desconto no boleto");
        System.out.format("Pagamento de R$%.2f realizado via boleto.\n", desconto);
    }
}
