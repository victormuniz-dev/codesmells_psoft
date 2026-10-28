package mercado;

public class PerfilStandard implements PerfilConta {
    @Override
    public double desconto(double valor) {
        return valor; // Sem desconto adicional
    }
}









