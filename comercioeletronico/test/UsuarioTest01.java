package praticasjava.comercioeletronico.test;

import praticasjava.comercioeletronico.dominio.CarrinhoDeCompras;
import praticasjava.comercioeletronico.dominio.Endereco;
import praticasjava.comercioeletronico.dominio.Produto;
import praticasjava.comercioeletronico.dominio.Usuario;
import praticasjava.comercioeletronico.servicos.*;

public class UsuarioTest01 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Mesa Industrial", "Mesa Industrial para trabalho", 300, 15);
        Produto produto2 = new Produto("Caderia ergonomica", "Caderia sustentavel", 500, 25);
        Produto produto3 = new Produto("Pc da Nasa", "pc da nasa", 30000, 5);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Endereco endereco = new Endereco("Abrantes", "Camaçari", "24800-984");
        Usuario usuario = new Usuario("Marcos", "luasdih@dmail.com", endereco);

        carrinho.adicionarCarrinho(produto1, 2);
        carrinho.adicionarCarrinho(produto2, 1);
        carrinho.adicionarCarrinho(produto3, 1);

        MetodoPagamento metodoPagamento = new PagamentoCartao();

        usuario.realizarPedido(carrinho, metodoPagamento);
    }
}
