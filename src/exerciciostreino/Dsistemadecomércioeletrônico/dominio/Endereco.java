package exerciciostreino.Dsistemadecomércioeletrônico.dominio;

public class Endereco {
    private String Bairro;
    private String cep;
    private String rua;

    public Endereco(String bairro, String cep, String rua) {
        Bairro = bairro;
        this.cep = cep;
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "Bairro='" + Bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                '}';
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
