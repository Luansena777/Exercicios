package exerciciostreino.biblioteca2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.format("Livro \"%s\" adicionado a biblioteca\n", livro.getTitulo());
    }

    public void removerLivro(String numeracao) {
        boolean livroEncontrado = false;
        for (Livro livro : livros) {
            if (numeracao.equals(livro.getNumeracao())) {
                livros.remove(livro);
                System.out.format("Livro \"%s\" removido a biblioteca\n", livro.getTitulo());
                livroEncontrado = true;
                livro.setDisponivel(false);
                break;
            }
        }
        if (!livroEncontrado) {
            throw new IllegalArgumentException("Identificador inválido");
        }
    }


    public void exibirLivro() {
        System.out.println("---- Biblioteca ----");
        System.out.println("-- Livros Disponíveis --");
        for (Livro livro : livros) {
            if (!livro.isDisponivel()) {
                System.out.println("Não tem livros disponíveis para mostrar.");
                break;
            } else {
                if (livro.isDisponivel()) livro.exibirLivro();
            }

        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}