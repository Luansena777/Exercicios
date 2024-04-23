package exerciciostreino.Bdesafiosistemabancario.dominio;


import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    ArrayList<Cliente> clientesList;
    private ContaBancaria[] contas;

    public Banco(String nome) {
        this.nome = nome;
        this.clientesList = new ArrayList<>();
    }

    public void adicionarClientes(Cliente cliente) {
        clientesList.add(cliente);
    }

    public void exibirInformacoesClientes() {
        System.out.println("--- Banco " + this.nome + " ---");
        for (Cliente cliente : clientesList) {
            System.out.print("Cliente: ");
            cliente.exibirInformacoes();
            System.out.println("=========================");
        }
    }

    public ContaBancaria[] getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Cliente> getClientesList() {
        return clientesList;
    }
}