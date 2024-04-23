package exerciciostreino.Cdesafiosistemabiblioteca.dominio;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void exibirUsuarios() {
        System.out.println("---Usuários---");
        for (Usuario usuario : usuarios) {
            usuario.exibirUsuario();
            System.out.println();
        }
    }
    public void exibiroBiblioteca() {
        System.out.println("--- Biblioteca ---");
        for (Livro livro : livros) {
            livro.exibirLivro();
            System.out.println();
        }
    }
}
