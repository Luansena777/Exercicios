package praticasjava.comercioeletronico.servicos;

public class PagamentoPix implements MetodoPagamento{
    public final double DESCONTO_PIX = 0.15;
    @Override
    public void pagamento(double valor) {
        double desconto = valor - (valor * DESCONTO_PIX);
        System.out.println("15% de desconto no pix");
        System.out.format("Pagamento de R$%.2f realizado via pix.\n", desconto);
    }
}
