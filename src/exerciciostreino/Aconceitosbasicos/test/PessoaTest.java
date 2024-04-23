package exerciciostreino.Aconceitosbasicos.test;

import exerciciostreino.Aconceitosbasicos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Luan", 20);
        pessoa.apresentar();
    }
}
