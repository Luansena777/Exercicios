package gerenciamentodepedidosrestaurante.dominio;

import gerenciamentodepedidosrestaurante.exception.PratoNaoDisponivelException;
import gerenciamentodepedidosrestaurante.exception.PratoNaoEncontradoException;
import gerenciamentodepedidosrestaurante.servico.Taxavel;
import gerenciamentodepedidosrestaurante.util.Buscar;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {
    private List<Prato> cardapio;
    private List<Prato> pedido;

    public SistemaPedidos() {
        this.cardapio = new ArrayList<>();
        this.pedido = new ArrayList<>();
    }

    //Adiciona pedidos ao cardápio
    public void adicionarAoCardapio(Prato prato) {
        try {
            // Verifica se o prato já existe no cardápio
            Prato pratoExixtente = Buscar.buscarPratoPorNome(cardapio, prato.nome);
            System.out.println("Erro: Já existe um prato com o nome '" + prato.getNome() + "' no cardápio.");

        } catch (PratoNaoDisponivelException | PratoNaoEncontradoException e) {
            cardapio.add(prato);
            System.out.println("Prato '" + prato.getNome() + "' adicionado ao cardápio com sucesso!");
        }
    }

    //Exibindo cardapio
    public void exibirCardapio() {
        System.out.println("------------");
        System.out.println("--- Cardápio ---");
        for (Prato prato : cardapio) {
            prato.exibirDetalhes();
        }
        System.out.println("------------");

    }

    // Adiciona um prato ao pedido
    public void adicionarAoPedido(String nome) throws PratoNaoDisponivelException, PratoNaoEncontradoException {
        Prato pratoPedido = Buscar.buscarPratoPorNome(cardapio, nome);
        if (!pratoPedido.isDisponivel()) {
            throw new PratoNaoDisponivelException("Prato não disponivel no momento.");
        }
        pedido.add(pratoPedido);
        System.out.println("Prato adicionado ao pedido!");
    }


    //Calculanto total do pedido
    protected double calcularTotalPedido() {
        double total = 0;
        for (Prato prato : pedido) {
            total += prato.getPreco();
            if (prato instanceof Taxavel) {
                total += ((Taxavel) prato).calculartaxa();
            }
        }
        return total;
    }


    // Exibe o resumo do pedido
    public void exibirResumoPedido() {
        if (pedido.isEmpty()) {
            System.out.println("Nenhum prato adidcionado ao pedido");
            return;
        }

        System.out.println("- Resumo do Pedido -");
        for (Prato prato : pedido) {
            prato.exibirDetalhes();
        }
        System.out.println("Total: R$" + calcularTotalPedido());
    }
}
