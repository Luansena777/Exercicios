package exaluno.domain;

import exaluno.service.CalcularNotas;

public class Aluno extends Pessoa implements CalcularNotas {
    private String matricula;
    private String curso;
    private float media;

    public Aluno(String nome, String cpf, String matricula, String curso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.media = 0;
    }

    @Override
    public void calcularMedia(float n1, float n2, float n3, float n4) {
        this.media = (n1 + n2 + n3 + n4) / 2;
        System.out.println("Média: " + media);

    }

    @Override
    public void verificarAprovacao() {
        if (media >= 13) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
