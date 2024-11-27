package sistemalocadorafilmes.dominio;

import java.util.ArrayList;

public class Locadora {
    private ArrayList<Filme> filmes;
    private ArrayList<Cliente> clientes;

    public Locadora() {
        this.filmes = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    //Métodos para cadastro
    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme cadastrado: " + filme.getTitulo());

    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado: " + cliente.getNome());

    }

    // Exibe os filmes disponíveis para aluguel
    public void consultarFilmesDisponiveis() {
        System.out.println("--- Filmes Disponíveis ---");
        for (Filme filmes : filmes) {
            if (filmes.isDisponivel()) {
                System.out.println(filmes);
            }
        }
    }

    // Realiza o aluguel de um filme para um cliente
    public void alugarFilme(String titulo, int clienteId) {
        Filme filmeParaAlugar = buscarFilme(titulo);
        Cliente cliente = buscarCliente(clienteId);

        if (filmeParaAlugar == null || !filmeParaAlugar.isDisponivel()) {
            System.out.println("Erro: Filme não disponível para aluguel.");
            return;
        }

        if (cliente == null) {
            System.out.println("Erro: Cliente não encontrado.");
            return;
        }

        if (cliente.temFilme(titulo)) {
            System.out.println("Erro: O cliente já alugou este filme.");
            return;
        }


        filmeParaAlugar.setDisponivel(false); // Marca o filme como alugado
        cliente.getFilmesAlugados().add(filmeParaAlugar); // Adiciona o filme à lista de filmes alugados
        System.out.println(cliente.getNome() + " alugou o filme: " + filmeParaAlugar.getTitulo());

    }

    // Realiza a devolução de um filme por um cliente
    public void devolverFilme(String titulo, int clienteId) {
        Cliente cliente = buscarCliente(clienteId);

        if (cliente == null) {
            System.out.println("Erro: Cliente não encontrado.");
            return;
        }

        if (!cliente.temFilme(titulo)) {
            System.out.println("Erro: O cliente não alugou este filme.");
            return;
        }


        // Encontra o filme para devolução
        Filme filmeParaDevolver = null;
        for (Filme filme : cliente.getFilmesAlugados()) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                filmeParaDevolver = filme;
                break;
            }
        }

        filmeParaDevolver.setDisponivel(true); // Marca o filme como disponível
        cliente.getFilmesAlugados().remove(filmeParaDevolver); // Remove o filme da lista de alugados
        System.out.println(cliente.getNome() + " devolveu o filme: " + filmeParaDevolver.getTitulo());

    }

    // Busca um filme pelo título
    private Filme buscarFilme(String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null;
    }

    // Busca um cliente pelo ID
    private Cliente buscarCliente(int clienteId) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == clienteId) {
                return cliente;
            }
        }
        return null;
    }


    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
