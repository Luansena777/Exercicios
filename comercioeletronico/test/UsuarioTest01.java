package praticasjava.comercioeletronico.test;

import praticasjava.comercioeletronico.dominio.*;
import praticasjava.comercioeletronico.servicos.*;

public class UsuarioTest01 {
    public static void main(String[] args) {
        boolean statusCompraFinalizada = false;
        Produto produto1 = new Produto("Mesa Industrial", "Mesa Industrial para trabalho", 300, 15, Categoria.ESCRITORIO);
        Produto produto2 = new Produto("Caderia ergonomica", "Caderia sustentavel", 500, 25, Categoria.ESCRITORIO);
        Produto produto3 = new Produto("Pc da Nasa", "pc da nasa", 30000, 5, Categoria.ELETRONICO);


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Endereco endereco = new Endereco("Abrantes", "Camaçari", "24800-984");
        Usuario usuario = new Usuario("Marcos", "luasdih@dmail.com", endereco);

        carrinho.adicionarCarrinho(produto1, 2);
        carrinho.adicionarCarrinho(produto2, 1);
        carrinho.adicionarCarrinho(produto3, 1);

        Pagamento metodoPagamento = new PagamentoCartao();

        usuario.realizarPedido(carrinho, metodoPagamento);
    }
}
