package Refactoring.TiposPagamentos;

public class PagamentoPix implements MetodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Gerando QR Code do PIX no valor de R$ " + valor);
    }
}
