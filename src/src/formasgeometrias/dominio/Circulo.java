package formasgeometrias.dominio;

import java.text.DecimalFormat;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
        this.raio = raio;
    }

    @Override
    public void exibirInformacoesArea() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Círculo:");
        System.out.println("Raio = " + df.format(raio));
        System.out.println("Área = " + df.format(calcularArea()));
    }

    @Override
    protected double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }
}
