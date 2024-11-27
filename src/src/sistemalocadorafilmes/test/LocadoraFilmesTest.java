package sistemalocadorafilmes.test;

import sistemalocadorafilmes.dominio.Cliente;
import sistemalocadorafilmes.dominio.Filme;
import sistemalocadorafilmes.dominio.Locadora;

public class LocadoraFilmesTest {
    public static void main(String[] args) {
        Filme filme = new Filme("Avatar", "Ação", 2014);
        Cliente cliente = new Cliente("Luan", 12345);
        Locadora locadora = new Locadora();
        locadora.cadastrarFilme(filme);
        locadora.cadastrarCliente(cliente);

        locadora.alugarFilme("avatar", 12345);
        locadora.devolverFilme("avataR", 12345);

    }
}
