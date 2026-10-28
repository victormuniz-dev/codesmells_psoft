public class ProcessadorPagamento { 
    public void processarComprador(String metodo, double valor) { 
        switch (metodo) { 
            
            case "CARTAO": 
            // Conecta na API do cartão, valida limite e parcela 
            System.out.println("Debitando R$ " + valor + " no Cartão de Crédito."); 
            break; 

            case "PIX": 
            System.out.println("Gerando QR Code do PIX no valor de R$ " + valor); 
            break; 

            case "BOLETO": 
            System.out.println("Emitindo boleto bancário de R$ " + valor); 
            break; 

            default: 
            throw new IllegalArgumentException("Método de pagamento não suportado."); 
        } 
    } 
}