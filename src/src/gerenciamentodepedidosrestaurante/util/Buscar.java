package gerenciamentodepedidosrestaurante.util;

import gerenciamentodepedidosrestaurante.dominio.Prato;
import gerenciamentodepedidosrestaurante.exception.PratoNaoDisponivelException;
import gerenciamentodepedidosrestaurante.exception.PratoNaoEncontradoException;

import java.util.List;

public class Buscar {
    public static Prato buscarPratoPorNome(List<Prato> cardapio, String nome) throws PratoNaoEncontradoException, PratoNaoDisponivelException {
        for (Prato prato : cardapio) {
            if (prato.getNome().equalsIgnoreCase(nome)) {
                return prato;

            }
        }
        throw new PratoNaoEncontradoException("Prato não encontrado no cardápio.");
    }


}
