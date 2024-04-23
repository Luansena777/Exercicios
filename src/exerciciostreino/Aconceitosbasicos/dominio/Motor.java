package exerciciostreino.Aconceitosbasicos.dominio;

public class Motor {
    private String potencia;
    private String cilindrada;

    public Motor(String potencia, String cilindrada) {
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
