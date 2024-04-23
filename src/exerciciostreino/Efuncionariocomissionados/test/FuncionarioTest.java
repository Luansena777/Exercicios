package exerciciostreino.Efuncionariocomissionados.test;

import exerciciostreino.Efuncionariocomissionados.dominio.FuncionarioComissionado;
import exerciciostreino.Efuncionariocomissionados.dominio.FuncionarioComissionadoPlus;

public class FuncionarioTest {
    public static void main(String[] args) {
        FuncionarioComissionado funcionario1 = new FuncionarioComissionado
                ("Luan sena da Silva", "17879", 10000, .3);
        funcionario1.exibirFuncionario();
        System.out.println("--------------------");
        FuncionarioComissionado funcionario2 = new FuncionarioComissionadoPlus("Marco", "111-222-333", 5000, 2256, 0.1);
        funcionario2.exibirFuncionario();
    }
}
