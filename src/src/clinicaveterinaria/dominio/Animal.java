package clinicaveterinaria.dominio;

public class Animal {
    private String nome;
    private int idade;
    private String especie;
    private Dono dono;


    public Animal(String nome, int idade, String especie, Dono dono) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
