package ExercicoSistemaBancario.test;

import ExercicoSistemaBancario.dominio.Banco;
import ExercicoSistemaBancario.dominio.Cliente;
import ExercicoSistemaBancario.dominio.ContaBancaria;
import ExercicoSistemaBancario.dominio.TipoConta;

public class SistemaBancarioTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luan", "159357468-99", 20);
        ContaBancaria conta1 = new ContaBancaria("78945-9", 12345, TipoConta.CONTA_CORRENTE);

        Cliente cliente2 = new Cliente("Marcos", "1591121268-99", 26);
        ContaBancaria conta2 = new ContaBancaria("00001-5", 1500, TipoConta.CONTA_POUPANCA);

        Cliente cliente3 = new Cliente("Pedro", "89235468-99", 40);
        ContaBancaria conta3 = new ContaBancaria("56465-6", 127845, TipoConta.CONTA_CORRENTE);

        ContaBancaria[] contaBancarias = { conta1, conta2, conta3 };
        Cliente[] clientes = { cliente1, cliente2, cliente3 };

        Banco banco = new Banco("Banco Jurds", clientes);
        // banco.exibirInformacoesClientes();

        conta1.sacar(6000);
        conta1.depositar(45000);

        cliente1.adicionarConta(conta1);
        cliente1.exibirInformacoes();

    }
}
