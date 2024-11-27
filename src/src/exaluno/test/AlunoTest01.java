package exaluno.test;

import exaluno.domain.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Luan", "12345678978", "010203", "Ads");
        aluno.calcularMedia(7, 7, 7, 7);
        aluno.verificarAprovacao();


    }
}
