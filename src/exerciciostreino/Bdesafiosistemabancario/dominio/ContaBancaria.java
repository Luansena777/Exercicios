package exerciciostreino.Bdesafiosistemabancario.dominio;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private TipoConta tipoConta;

    public ContaBancaria(String numeroConta, TipoConta tipoConta, double valorDeposito) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        if (valorDeposito < 0){
            throw new IllegalArgumentException();
        }
        depositar(valorDeposito);
    }

    public void imprimConta() {
        System.out.println("Numero: " + this.numeroConta +
                ", Saldo: R$" + this.saldo +
                ", Tipo de Conta: " + getTipoConta());
    }

    public void depositar(double valorDepositar) {
        saldo += valorDepositar;
        System.out.println("Depósito de " + valorDepositar + " realizado. Novo saldo: " + saldo);
    }

    public void sacar(double valorSacar) {
        if (valorSacar > saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldo -= valorSacar;
            System.out.println("Saque de " + valorSacar + " realizado. Novo saldo: " + saldo);
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
}
