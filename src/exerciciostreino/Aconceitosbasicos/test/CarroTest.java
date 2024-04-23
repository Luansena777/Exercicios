package exerciciostreino.Aconceitosbasicos.test;

import exerciciostreino.Aconceitosbasicos.dominio.Carro;
import exerciciostreino.Aconceitosbasicos.dominio.Motor;

public class CarroTest {
    public static void main(String[] args) {
        Motor motor = new Motor("300CV", "1200");
        Carro carro = new Carro("BMW M4", "branca", motor);

        System.out.println(carro);
    }
}
