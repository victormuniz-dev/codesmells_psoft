package Refactoring.TiposPagamentos;

public class PagamentoBoleto implements MetodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Emitindo boleto bancário de R$ " + valor);
    }
}
