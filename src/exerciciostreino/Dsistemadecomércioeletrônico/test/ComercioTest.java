package exerciciostreino.Dsistemadecomércioeletrônico.test;

import exerciciostreino.Dsistemadecomércioeletrônico.dominio.Carrinho;
import exerciciostreino.Dsistemadecomércioeletrônico.dominio.Endereco;
import exerciciostreino.Dsistemadecomércioeletrônico.dominio.Produto;
import exerciciostreino.Dsistemadecomércioeletrônico.dominio.Usuario;

public class ComercioTest {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Dias D'avilla", "12345-678", "Sucupira");
        Usuario usuario1 = new Usuario("Marco", "marco123@gmail.com", endereco1);
        Produto produto1 = new Produto("Shampoo", "Elimina toda sujeiro", 20, 30);
        Produto produto2 = new Produto("Condicionador", "Hidrata e reduz o frizz", 25, 30);
        Carrinho carrinho = new Carrinho();


        carrinho.adicionarProduto(produto1, 2);
        carrinho.adicionarProduto(produto2, 5);
        carrinho.removerProduto(produto1);
        carrinho.removerProduto(produto2);


    }
}
