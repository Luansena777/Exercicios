package formasgeometrias.test;

import formasgeometrias.dominio.Circulo;
import formasgeometrias.dominio.Quadrado;
import formasgeometrias.dominio.Triangulo;
import formasgeometrias.dominio.Forma;

public class FormasGeometricasTest {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(4.0);
        Forma circulo = new Circulo(5.5);
        Forma triangulo = new Triangulo(7, 5);

        quadrado.exibirInformacoesArea();
        System.out.println();
        circulo.exibirInformacoesArea();
    }
}
