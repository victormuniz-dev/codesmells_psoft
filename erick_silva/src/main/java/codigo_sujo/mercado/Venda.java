package mercado;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private static final double DESCONTO_PREMIUM = 0.20;
    private static final double DESCONTO_ESTUDANTE = 0.10;

    private Cliente cliente;
    private List<ItemVenda> itens;
    private Pagamento pagamento;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new ItemVenda(produto, quantidade));
    }

    public double calcularTotal() {
        double totalItens = 0.0;
        for (ItemVenda item : itens) {
            totalItens += item.calcularSubtotal();
        }

        // Perfis em if: premium tem prioridade sobre estudante
        // (mesmo comportamento da versão com interface: um perfil por cliente)
        if (cliente.isPremium()) {
            return totalItens * (1 - DESCONTO_PREMIUM);   // 20%
        } else if (cliente.isEstudante()) {
            return totalItens * (1 - DESCONTO_ESTUDANTE); // 10%
        }

        return totalItens; // standard, sem desconto
    }

    public boolean efetuarPagamento() {
        double valorTotal = calcularTotal();
        this.pagamento = new Pagamento(valorTotal);
        return this.pagamento.isConfirmado();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
