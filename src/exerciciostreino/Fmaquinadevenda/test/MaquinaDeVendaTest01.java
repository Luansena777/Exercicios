package exerciciostreino.Fmaquinadevenda.test;

import exerciciostreino.Fmaquinadevenda.dominio.MaquinaDeVenda;
import exerciciostreino.Fmaquinadevenda.dominio.Produto;

public class MaquinaDeVendaTest01 {
    public static void main(String[] args) {
        MaquinaDeVenda maquinaDeVenda = new MaquinaDeVenda();

        Produto produto1 = new Produto("Camisa", "verde", 110, 5);
        Produto produto2 = new Produto("Calça", "Jogger Preta", 122.30, 5);
        Produto produto3 = new Produto("Boné", "Nike Preto", 99.99, 5);
        Produto produto4 = new Produto("Tênis", "NIKE AIR FORCE", 799.99, 5);
        Produto produto5 = new Produto("Relógio", "Technos Masculino Racer Preto", 499, 5);

        maquinaDeVenda.adicinarProduto(produto1);
        maquinaDeVenda.adicinarProduto(produto2);
        maquinaDeVenda.adicinarProduto(produto3);
        maquinaDeVenda.adicinarProduto(produto4);
        maquinaDeVenda.adicinarProduto(produto5);
        System.out.println();
        maquinaDeVenda.compraProduto(produto3, 2);
        maquinaDeVenda.exibirProdutos();
    }
}
