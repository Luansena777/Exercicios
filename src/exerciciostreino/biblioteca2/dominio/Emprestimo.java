package exerciciostreino.biblioteca2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private List<Livro> livroListli;
    private List<Livro> historicoEmprestimo;
    private List<Usuario> usuarios;

    public Emprestimo() {
        this.historicoEmprestimo = new ArrayList<>();
        this.livroListli = new ArrayList<>();
        this.usuarios = new ArrayList<>();

    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        System.out.println("--- Emprestimo ---");
        if (!livro.isDisponivel()) {
            throw new IndexOutOfBoundsException("Livro não encontrado para emprestimo");
        }
        livro.setDisponivel(false);
        System.out.print("Livro emprestado: ");
        livro.exibirLivro();
        System.out.print("Para: ");
        usuario.exibirUsuario();
        historicoEmprestimo.add(livro);

    }

    public void devolverLivro(Livro livro) {
        livro.setDisponivel(true);
        System.out.format("Livro %s devolvido.\n", livro.getTitulo());
        historicoEmprestimo.remove(livro);
    }


}