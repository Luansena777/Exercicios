package exerciciostreino.Cdesafiosistemabiblioteca.dominio;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    protected static String numeroIdentificacao;
    private ArrayList<Livro> historicoLivrosEmprestados;

    public Usuario(String nome, String numeroIdentificacao) {
        this.nome = nome;
        Usuario.numeroIdentificacao = numeroIdentificacao;
        this.historicoLivrosEmprestados = new ArrayList<>();
    }

    public void exibirUsuario() {
        System.out.println("Nome: " + this.nome +
                ", N° Identificação: " + numeroIdentificacao);
        System.out.println("Livros pegos: ");
        for (Livro livro : historicoLivrosEmprestados) {
            livro.exibirLivro();
        }
    }

    public void emprestarLivro(Livro livro) {
        livro.emprestar();
        historicoLivrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        historicoLivrosEmprestados.remove(livro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        Usuario.numeroIdentificacao = numeroIdentificacao;
    }

    public ArrayList<Livro> getHistoricoLivrosEmprestados() {
        return historicoLivrosEmprestados;
    }

}
