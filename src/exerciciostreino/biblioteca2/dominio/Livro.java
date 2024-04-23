package exerciciostreino.biblioteca2.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private String numeracao;
    private String genero;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, String genero, String numeracao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeracao = numeracao;
        this.genero = genero;
    }

    public void exibirLivro(){
        System.out.format("Título: %s, Autor: %s, Gênero: %s, Numeração: %s \n", this.titulo, this.autor, this.genero, this.numeracao);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
