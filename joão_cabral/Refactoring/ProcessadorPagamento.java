package Refactoring;

import Refactoring.TiposPagamentos.MetodoPagamento;

public class ProcessadorPagamento {
    public void processarComprador(MetodoPagamento metodo, double valor) {
        metodo.processar(valor);
    }
}
