package exerciciostreino.Bdesafiosistemabancario.test;

import exerciciostreino.Bdesafiosistemabancario.dominio.Banco;
import exerciciostreino.Bdesafiosistemabancario.dominio.Cliente;
import exerciciostreino.Bdesafiosistemabancario.dominio.ContaBancaria;
import exerciciostreino.Bdesafiosistemabancario.dominio.TipoConta;

public class SistemaBancarioTest {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Jurds");
        Banco banco2 = new Banco("Nu");
        Banco banco3 = new Banco("G7");

        Cliente cliente1 = new Cliente("Luan", "159357468-99", 21);
        Cliente cliente2 = new Cliente("Marcos", "1591121268-99", 26);
        Cliente cliente3 = new Cliente("Pedro", "89235468-99", 40);

        ContaBancaria conta1 = new ContaBancaria( "78945-9", TipoConta.CONTA_CORRENTE);
        ContaBancaria conta2 = new ContaBancaria( "00001-5", TipoConta.CONTA_POUPANCA);
        ContaBancaria conta3 = new ContaBancaria( "56465-6", TipoConta.CONTA_POUPANCA);


//        banco.adicionarClientes(cliente1);

        cliente1.adicionarConta(conta1);
        cliente2.adicionarConta(conta2);
        cliente3.adicionarConta(conta3);


        cliente1.depositar(conta1, 1750);
        cliente1.sacar(conta1, 750);

        cliente1.depositar(conta2, 750);
        cliente1.sacar(conta2, 150);

        cliente1.depositar(conta3, 1550);
        cliente1.sacar(conta3, 150);


//        cliente1.exibirInformacoes();

        banco1.adicionarClientes(cliente1);
        banco1.adicionarClientes(cliente2);
        banco1.adicionarClientes(cliente3);
        banco1.exibirInformacoesClientes();
    }
}
