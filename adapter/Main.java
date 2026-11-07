package adapter;

public class Main {
public static void main(String[] args) {
    Loja lojapix = new Loja(new PagamentoPix());

    lojapix.finalizarCompra(49.90);

    System.out.println();

    GatewayLegado legado = new GatewayLegado();

    Loja lojaLegado = new Loja(new gatewayAdapter(legado));
    lojaLegado.finalizarCompra(49.90);
}
}
