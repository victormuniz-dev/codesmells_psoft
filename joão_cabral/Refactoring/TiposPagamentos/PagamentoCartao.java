package Refactoring.TiposPagamentos;

public class PagamentoCartao implements MetodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Debitando R$ " + valor + " no Cartão de Crédito.");
    }
}
