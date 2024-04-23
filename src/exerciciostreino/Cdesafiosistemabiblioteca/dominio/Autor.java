package exerciciostreino.Cdesafiosistemabiblioteca.dominio;

public class Autor {
    private String nome;
    private String dataNascimento;
    private String nacionalidade;

    public Autor(String nome, String dataNascimento, String nacionalidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }

    public void exibirAutor() {
        System.out.println("Autor: " + this.nome +
                ", Data de Nascimento: " + this.dataNascimento +
                ", Nascionalidade: " + this.nacionalidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
