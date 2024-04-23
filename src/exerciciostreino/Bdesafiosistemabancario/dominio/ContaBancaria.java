package exerciciostreino.Bdesafiosistemabancario.dominio;

public class ContaBancaria {
    private String accountNumber;
    private double balance;
    private TipoConta accountType;

    public ContaBancaria( String accountNumber, TipoConta accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public ContaBancaria( String numeroConta, TipoConta accountType, double depositInitial) {
        this(numeroConta, accountType);
        if (depositInitial < 0) {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
        balance += depositInitial;
        System.out.printf("Primeiro depósito feito com sucesso. Saldo atual: %.2f", +balance);
    }

    public void imprimConta() {
        System.out.println("Numero: " + this.accountNumber +
                ", Saldo: R$" + this.balance +
                ", Tipo de Conta: " + getAccountType());
    }

    public void depositar(double valorDepositar) {
        if (valorDepositar < 0) {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
        balance += valorDepositar;
//        System.out.format("Depósito de %.2f concluído. Novo saldo: R$%.2f.\n", valorDepositar, this.balance);
    }

    public void sacar(double valorSacar) {
        if (valorSacar > balance) {
            throw new IllegalArgumentException("Saldo indisponível para saque. Informe um valor válido.");
        }
        balance -= valorSacar;
//        System.out.format("Saque de %.2f realizado. Novo saldo: R$%.2f\n", valorSacar, balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public TipoConta getAccountType() {
        return accountType;
    }

    public void setAccountType(TipoConta accountType) {
        this.accountType = accountType;
    }

}
