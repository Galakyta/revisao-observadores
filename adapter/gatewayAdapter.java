package adapter;

public class gatewayAdapter implements ProcessadorPagamento{

private final GatewayLegado gateway;

public gatewayAdapter(GatewayLegado gateway){
this.gateway = gateway;
}

@Override 

public void pagar(double valor){
    int centavos = (int) Math.round(valor * 100);
    gateway.efetuarCobrancaEmCentavos(centavos, "BRL");
}

}
