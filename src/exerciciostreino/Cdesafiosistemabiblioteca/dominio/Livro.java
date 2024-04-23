package exerciciostreino.Cdesafiosistemabiblioteca.dominio;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private ArrayList<Autor> autors;
    private int totalCopias;
    private int copiasDisponiveis;

    public Livro(String titulo, int anoPublicacao, int totalCopias, int copiasDisponiveis) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.totalCopias = totalCopias;
        this.copiasDisponiveis = copiasDisponiveis;
        this.autors = new ArrayList<>();
    }

    public void adiconarAutor(Autor autor) {
        autors.add(autor);
    }

    public void emprestar() {
        if (copiasDisponiveis > 0) {
            copiasDisponiveis--;
        } else {
            System.out.println("Não há cópias disponíveis para empréstimo.");
        }
    }

    public void devolver() {
        if (copiasDisponiveis < totalCopias) {
            copiasDisponiveis++;
        } else {
            System.out.println("Quantidade disponível já está no máximo.");
        }
    }
    public void exibirLivro() {
        System.out.println("Livro: " + this.titulo +
                ", Publicação: " + this.anoPublicacao +
                ", Cópias Disponíveis: " + this.copiasDisponiveis);
        for (Autor autor : autors) {
            autor.exibirAutor();
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(int totalCopias) {
        this.totalCopias = totalCopias;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }
}
