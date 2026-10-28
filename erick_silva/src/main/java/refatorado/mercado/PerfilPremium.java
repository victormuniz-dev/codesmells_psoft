package mercado;

public class PerfilPremium implements PerfilConta {
    @Override
    public double desconto(double valor) {
        return valor * 0.80; // Aplica 20% de desconto sobre o valor total
    }
}




