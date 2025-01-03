package clinicaveterinaria.servico;

import clinicaveterinaria.dominio.Animal;

public class Consulta {
    private String data;
    private Animal animal;
    private String descricao;

    public Consulta(String data, Animal animal, String descricao) {
        this.data = data;
        this.animal = animal;
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
