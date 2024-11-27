package formasgeometrias.dominio;


import java.text.DecimalFormat;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("O lado deve ser positivo.");
        }
        this.lado = lado;
    }

    @Override
    public void exibirInformacoesArea() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Quadrado:");
        System.out.println("Lado = " + df.format(lado));
        System.out.println("Área = " + df.format(calcularArea()));
    }

    @Override
    protected double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("O lado deve ser positivo.");
        }
        this.lado = lado;
    }
}
