package gerenciamentodepedidosrestaurante.test;

import gerenciamentodepedidosrestaurante.dominio.Bebida;
import gerenciamentodepedidosrestaurante.dominio.PratoPrincipal;
import gerenciamentodepedidosrestaurante.dominio.SistemaPedidos;
import gerenciamentodepedidosrestaurante.dominio.Sobremesa;

public class RestauranteApp {
    public static void main(String[] args) {
        SistemaPedidos sistemaPedidos = new SistemaPedidos();

        sistemaPedidos.adicionarAoCardapio(new PratoPrincipal("Lasanha", 25.22, true));
        sistemaPedidos.adicionarAoCardapio(new Bebida("Coca Cola", 15, true));
        sistemaPedidos.adicionarAoCardapio(new Sobremesa("Mousse de Maracuja", 30, true));

        sistemaPedidos.adicionarAoCardapio(new PratoPrincipal("Bife à Parmegiana", 37.45, true));
        sistemaPedidos.adicionarAoCardapio(new Bebida("Coca-Cola", 5.0, true));
        sistemaPedidos.adicionarAoCardapio(new PratoPrincipal("Lasanha", 25.0, false));

        sistemaPedidos.exibirCardapio();
        try {

            sistemaPedidos.adicionarAoPedido("Lasanha");
            sistemaPedidos.adicionarAoPedido("Coca Cola");
            sistemaPedidos.adicionarAoPedido("mousse de maracuja");
            sistemaPedidos.adicionarAoPedido("mousse de maracuja");

            sistemaPedidos.exibirResumoPedido();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
