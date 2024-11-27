package sistemalocadorafilmes.dominio;

import java.util.ArrayList;

public class Locadora {
    private ArrayList<Filme> filmes;
    private ArrayList<Cliente> clientes;

    public Locadora() {
        this.filmes = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void consultatFilmeDisponivel() {
        System.out.println("Filmes Disponíveis");
        for (Filme filmes : filmes) {
            if (filmes.isDisponivel()) {
                System.out.println(filmes);
            }
        }
    }

    public void alugarFilme(String titulo, int clienteId) {
        Filme filmeParaAlugar = null;
        Cliente cliente = null;

        //Encontrar filme
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo) && filme.isDisponivel()) {
                filmeParaAlugar = filme;
                break;
            }
        }

        //Encontrar cliente
        for (Cliente c : clientes) {
            if (c.getId() == clienteId) {
                cliente = c;
                break;
            }
        }

        //Validar e realizar o aluguel
        if (filmeParaAlugar != null && cliente != null) {
            filmeParaAlugar.setDisponivel(false);
            cliente.getFilmesAlugados().add(filmeParaAlugar);
            System.out.println(cliente.getNome() + " alugou o filme: " + filmeParaAlugar.getTitulo());
        } else {
            System.out.println("Erro: Filme indisponível ou cliente não encontrado.");
        }
    }

    public void devolverFilme(String titulo, int clienteId) {
        Cliente cliente = null;

        //Buscando cliente
        for (Cliente c : clientes) {
            if (c.getId() == clienteId) {
                cliente = c;
                break;
            }
        }

        if (cliente != null) {
            //Encontrar filme na lista do cliente
            Filme filmeParaDevolver = null;
            for (Filme filme : cliente.getFilmesAlugados()) {
                if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                    filmeParaDevolver = filme;
                    break;
                }
            }


            if (filmeParaDevolver != null) {
                filmeParaDevolver.setDisponivel(true);
                cliente.getFilmesAlugados().remove(filmeParaDevolver);
                System.out.println(cliente.getNome() + " devolveu o filme: " + filmeParaDevolver.getTitulo());
            } else {
                System.out.println("Erro: Filme não encontrado nos filmes alugados pelo cliente.");

            }

        } else {
            System.out.println("Erro: Cliente não encontrado.");
        }

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
