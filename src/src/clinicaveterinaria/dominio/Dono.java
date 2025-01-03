package clinicaveterinaria.dominio;

import java.util.List;

public class Dono {
    private String nome;
    private String telefone;
    private List<Animal> animais;

    public Dono(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Dono(String nome, String telefone, List<Animal> animais) {
        this.nome = nome;
        this.telefone = telefone;
        this.animais = animais;
    }

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
}
