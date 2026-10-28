package mercado;

public class PerfilEstudante implements PerfilConta {
    @Override
    public double desconto(double valor) {
        return valor * 0.90; // Aplica 10% de desconto sobre o valor total
    }
}







