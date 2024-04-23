package exerciciostreino.Efuncionariocomissionados.dominio;

public class FuncionarioComissionado {
    protected String nomeCompleto;
    protected String numSeguroSocial;
    protected double vendasBrutas;
    protected double comissaoPorcentagem;

    public FuncionarioComissionado(String nomeCompleto, String numSeguroSocial,
                                   double vendasBrutas, double comissaoPorcentagem) {
        this.nomeCompleto = nomeCompleto;
        this.numSeguroSocial = numSeguroSocial;
        this.vendasBrutas = vendasBrutas;
        this.comissaoPorcentagem = comissaoPorcentagem;

        if (vendasBrutas <= 0) {
            throw new IllegalArgumentException("Valor das vendas não pode ser <= 0");
        }

        if (comissaoPorcentagem <= 0.0 || comissaoPorcentagem >= 1.0) {
            throw new IllegalArgumentException("Valor de comissão inválido");
        }
    }

    public void exibirFuncionario() {
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("N° Seguro Social: " + this.numSeguroSocial);
        System.out.println("Valor bruto das vendas: R$" + this.vendasBrutas);
        System.out.println("Salario final: R$" + ganhos());
    }

    public double ganhos() {
        return (vendasBrutas * comissaoPorcentagem);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNumSeguroSocial() {
        return numSeguroSocial;
    }

    public void setNumSeguroSocial(String numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        if (vendasBrutas <= 0) {
            throw new IllegalArgumentException("Valor das vendas não pode ser <= 0");
        }
        this.vendasBrutas = vendasBrutas;
    }

    public double getComissaoPorcentagem() {
        return comissaoPorcentagem;
    }

    public void setComissaoPorcentagem(double comissaoPorcentagem) {
        if (comissaoPorcentagem <= 0.0 || comissaoPorcentagem >= 1.0) {
            throw new IllegalArgumentException("Valor de comissão inválido");
        }
        this.comissaoPorcentagem = comissaoPorcentagem;
    }
}
