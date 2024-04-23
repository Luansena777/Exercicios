package exerciciostreino.Aconceitosbasicos.dominio;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Curso: " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
