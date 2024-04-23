package exerciciostreino.Bdesafiosistemabancario.test;

import exerciciostreino.Bdesafiosistemabancario.dominio.Banco;
import exerciciostreino.Bdesafiosistemabancario.dominio.Cliente;
import exerciciostreino.Bdesafiosistemabancario.dominio.ContaBancaria;
import exerciciostreino.Bdesafiosistemabancario.dominio.TipoConta;

public class SistemaBancarioTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luan", "159357468-99", 21);
        ContaBancaria conta1 = new ContaBancaria("78945-9", TipoConta.CONTA_CORRENTE, 320);

        Cliente cliente2 = new Cliente("Marcos", "1591121268-99", 26);
        ContaBancaria conta2 = new ContaBancaria("00001-5", TipoConta.CONTA_POUPANCA);

        Cliente cliente3 = new Cliente("Pedro", "89235468-99", 40);
        ContaBancaria conta3 = new ContaBancaria("56465-6", TipoConta.CONTA_POUPANCA);

//        ContaBancaria[] contaBancarias = {conta1, conta2, conta3};
//        Cliente[] clientes = {cliente1, cliente2, cliente3};

//        conta1.depositar(111111111);

        cliente1.adicionarConta(conta1);
//        banco.exibirInformacoesClientes();
//        conta1.sacar(6000);
//        conta1.depositar(45000);
//
//        cliente1.exibirInformacoes();

        Banco banco = new Banco("Banco Jurds");
        banco.adicionarClientes(cliente1);
        banco.exibirInformacoesClientes();

//        cliente1.adicionarConta(conta1);
//        cliente1.adicionarConta(conta2);

//        cliente1.exibirInformacoes();










    }
}
