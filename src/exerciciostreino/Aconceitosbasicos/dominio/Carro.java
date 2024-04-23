package exerciciostreino.Aconceitosbasicos.dominio;

public class Carro {
    private String modelo;
    private String cor;

    private Motor motor;

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", cilindradas=" + motor.getCilindrada() +
                ", motor=" + motor.getPotencia() +
                '}';
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
