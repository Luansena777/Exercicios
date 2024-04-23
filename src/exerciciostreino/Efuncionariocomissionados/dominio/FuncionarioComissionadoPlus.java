package exerciciostreino.Efuncionariocomissionados.dominio;

public class FuncionarioComissionadoPlus extends FuncionarioComissionado {
    private double salarioBase;

    public FuncionarioComissionadoPlus(String nomeCompleto, String numSeguroSocial, double vendasBrutas, double salarioBase, double comissaoPorcentagem) {
        super(nomeCompleto, numSeguroSocial, vendasBrutas, comissaoPorcentagem);
        this.salarioBase = salarioBase;
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Valor salario invalido");
        }
    }

    @Override
    public void exibirFuncionario() {
        System.out.println("Salario Base: R$" + this.salarioBase);
        super.exibirFuncionario();
    }

    @Override
    public double ganhos() {
        return salarioBase + super.ganhos();
    }



    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Valor salario invalido");
        }
        this.salarioBase = salarioBase;
    }
}
