package gerenciamentodeclientes.dominio;

import gerenciamentodeclientes.exception.ClienteException;
import gerenciamentodeclientes.exception.CpfException;
import gerenciamentodeclientes.util.OrdenaPorNome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaDeClientes {
    private List<Cliente> clienteList;

    public SistemaDeClientes() {
        this.clienteList = new ArrayList<>();
    }

    public void adicionarClientes(Cliente cliente) {
        for (Cliente listCliente : clienteList) {
            if (listCliente.getCpf().equals(cliente.getCpf())){
                throw new CpfException("Já existe um cliente com este CPF.");
            }
        }

        clienteList.add(cliente);
        System.out.println("Cliente cadastrado com sucesso.");
    }

    public void removerCliente(String cpf) {
        for (Cliente cliente : clienteList) {
            if (cpf.equals(cliente.getCpf())) {
                clienteList.remove(cliente);
                System.out.println("Cliente removido com sucesso!");
                return;
            }
        }
        throw new IllegalArgumentException("Cliente com CPF " + cpf + " não encontrado.");
    }

    public void listarClientes() {
        if (clienteList.isEmpty()){
            System.out.println("Nenhum cliente cadastrado.");
        }

        //Ordena em ordem alfabetica de A-Z
        Collections.sort(clienteList, new OrdenaPorNome());
        for (Cliente cliente : clienteList) {
            System.out.println("Lista de Clientes:");
            cliente.exibirDetalhes();
        }
    }

    public void buscarCliente(String cpf) {
        for (Cliente cliente : clienteList) {
            if (cpf.equals(cliente.getCpf())) {
                cliente.exibirDetalhes();
                return;
            }
        }
        throw new ClienteException("Cliente não encontrado.");
    }

    public void atualizarCliente(String cpf, String newDataNascimento, String newEmail) {
        for (Cliente cliente : clienteList) {
            if (cpf.equals(cliente.getCpf())) {
                cliente.setDataNascimento(newDataNascimento);
                cliente.setEmail(newEmail);
                System.out.println("Informações do cliente atualizadas com sucesso!");
                return;
            }
        }
        throw new ClienteException("Cliente não encontrado.");
    }

}
