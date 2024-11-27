package ExercicioBiblioteca.dominio;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<ExercicioBiblioteca.dominio.Livro> livros;
    private ArrayList<ExercicioBiblioteca.dominio.Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(ExercicioBiblioteca.dominio.Livro livro) {
        livros.add(livro);
    }
    public void registrarUsuario(ExercicioBiblioteca.dominio.Usuario usuario) {
        usuarios.add(usuario);
    }

    public void exibirUsuarios() {
        System.out.println("---Usuários---");
        for (ExercicioBiblioteca.dominio.Usuario usuario : usuarios) {
            usuario.exibirUsuario();
            System.out.println();
        }
    }
    public void exibiroBiblioteca() {
        System.out.println("--- Biblioteca ---");
        for (ExercicioBiblioteca.dominio.Livro livro : livros) {
            livro.exibirLivro();
            System.out.println();
        }
    }
}
