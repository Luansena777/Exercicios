package formasgeometrias.dominio;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        if (base < 0) {
            throw new IllegalArgumentException("A base deve ser positiva.");
        }
        if (altura < 0) {
            throw new IllegalArgumentException("A altura deve ser positiva.");

        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void exibirInformacoesArea() {
        System.out.println("Área do Triângulo = " + calcularArea());
    }

    @Override
    protected double calcularArea() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("A base deve ser positiva. ");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("A altura deve ser positiva.");
        }
        this.altura = altura;
    }
}
