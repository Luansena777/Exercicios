package praticasjava.comercioeletronico.dominio;

public class Endereco {
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(String bairro, String cidade, String cep) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public void imprimeEndereco(){
        System.out.println("Bairro: "+this.bairro + ", Cidade: "+ this.cidade + ", Cep: "+ this.cep);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
