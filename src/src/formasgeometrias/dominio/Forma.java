package formasgeometrias.dominio;

public abstract class Forma {
    public abstract void exibirInformacoesArea(); // Método abstrato para exibir informações
    protected abstract double calcularArea(); // Método abstrato para calcular a area e  ser implementado por subclasses

}
