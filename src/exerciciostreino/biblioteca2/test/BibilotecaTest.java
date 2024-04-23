package exerciciostreino.biblioteca2.test;

import exerciciostreino.biblioteca2.dominio.Biblioteca;
import exerciciostreino.biblioteca2.dominio.Emprestimo;
import exerciciostreino.biblioteca2.dominio.Livro;
import exerciciostreino.biblioteca2.dominio.Usuario;

import java.io.IOException;

public class BibilotecaTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Luan", 21);
        Usuario usuario2 = new Usuario("Marco", 38);

        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Pequeno Principe", "Antoine de Saint-Exupéry", "Literatura infantil", "1234");
        Livro livro2 = new Livro("A Arte da Guerra", "Sun Tzu", "Não ficção", "1874");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Emprestimo emprestimo = new Emprestimo();

        emprestimo.emprestarLivro(livro2, usuario);
        emprestimo.emprestarLivro(livro1, usuario);

        biblioteca.exibirLivro();


    }
}
