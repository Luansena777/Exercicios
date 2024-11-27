package sistemalocadorafilmes.dominio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int id;
    private ArrayList<Filme> filmesAlugados;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.filmesAlugados = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome + " - ID: " + this.id + " - Filmes alugados: " + filmesAlugados.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Filme> getFilmesAlugados() {
        return filmesAlugados;
    }

    public void setFilmesAlugados(ArrayList<Filme> filmesAlugados) {
        this.filmesAlugados = filmesAlugados;
    }
}
