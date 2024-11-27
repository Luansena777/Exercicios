package sistemalocadorafilmes.dominio;

public class Filme {
    private String titulo;
    private String genero;
    private int ano;
    private boolean disponivel;

    public Filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.disponivel = true; //Inicialmente disponivel.
    }

    @Override
    public String toString() {
        return titulo + " (" + ano + ") - Gênero: " + genero +
               " - " + (disponivel ? "Disponível" : "Indisponível");
    }

    public String getTitulo() {
        return titulo;
    }


    public String getGenero() {
        return genero;
    }


    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
