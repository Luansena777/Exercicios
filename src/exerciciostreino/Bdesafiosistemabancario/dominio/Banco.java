package exerciciostreino.Bdesafiosistemabancario.dominio;


public class Banco {
    private String nome;
    private Cliente[] clientes;
    private ContaBancaria[] contas;

    public Banco(String nome, Cliente[] clientes) {
        this.nome = nome;
        this.clientes = clientes;
    }

    public void exibirInformacoesClientes() {
        System.out.println("Banco: " + this.nome);
        for (Cliente cliente : clientes) {
            cliente.exibirInformacoes();
        }
    }

    public ContaBancaria[] getContas() {
        return contas;
    }

    public void setContas(ContaBancaria[] contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

}
