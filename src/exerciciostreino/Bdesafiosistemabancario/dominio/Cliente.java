package exerciciostreino.Bdesafiosistemabancario.dominio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private ArrayList<ContaBancaria> contas;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        if (idade <= 0 || idade >= 150) {
            throw new IllegalArgumentException("Idade não permitida ou inválida.");
        }
        this.idade = idade;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade);
        for (ContaBancaria conta : contas) conta.imprimConta();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0 || idade >= 150) {
            throw new IllegalArgumentException("Argumento inválido, idade com valor não permitido.");
        }
        this.idade = idade;
    }
}
