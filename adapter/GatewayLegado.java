package adapter;

public class GatewayLegado {
public void efetuarCobrancaEmCentavos(int centavos, String moeda){
    System.out.println("[gatewayLegado] cobrado:" + centavos + "centavos em " + moeda);
}
}
