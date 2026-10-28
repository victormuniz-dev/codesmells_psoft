package mercado;

import java.util.ArrayList;
import java.util.List;

public class Venda {
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
        // O desconto do perfil é responsabilidade do próprio perfil
        return cliente.getPerfil().desconto(totalItens);
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
