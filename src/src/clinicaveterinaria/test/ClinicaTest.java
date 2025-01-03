package clinicaveterinaria.test;

import clinicaveterinaria.dominio.Animal;
import clinicaveterinaria.dominio.Dono;

public class ClinicaTest {
    public static void main(String[] args) {
        Dono dono1 = new Dono("Leonardo", "(74) 9 7894-5612");
        Animal animal1 = new Animal("Leon", 3, "Cachorro", dono1);

        dono1.adicionarAnimal(animal1);
        System.out.println(dono1.getAnimais());

    }
}
