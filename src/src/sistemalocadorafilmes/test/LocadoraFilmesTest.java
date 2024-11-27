package sistemalocadorafilmes.test;

import sistemalocadorafilmes.dominio.Cliente;
import sistemalocadorafilmes.dominio.Filme;
import sistemalocadorafilmes.dominio.Locadora;

public class LocadoraFilmesTest {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        // Cadastrar filmes
        locadora.cadastrarFilme(new Filme("Matrix", "Ficção Científica", 1999));
        locadora.cadastrarFilme(new Filme("Titanic", "Romance", 1997));
        locadora.cadastrarFilme(new Filme("O Rei Leão", "Animação", 1994));

        // Cadastrar clientes
        locadora.cadastrarCliente(new Cliente("Alice", 1));
        locadora.cadastrarCliente(new Cliente("Bob", 2));

        // Consultar filmes disponíveis
        locadora.consultarFilmesDisponiveis();

        // Alugar filmes
        locadora.alugarFilme("Matrix", 1);
        locadora.alugarFilme("O Rei Leão", 2);

        // Tentar alugar um filme já alugado
        locadora.alugarFilme("Matrix", 2);

        // Consultar filmes disponíveis novamente
        locadora.consultarFilmesDisponiveis();

        // Devolver filmes
        locadora.devolverFilme("Matrix", 1);
        locadora.devolverFilme("O Rei Leão", 2);
        locadora.devolverFilme("O Rei Leão", 2);

        // Consultar filmes disponíveis após devoluções
        locadora.consultarFilmesDisponiveis();

    }
}
