package strategy;

public class Main {

public static void main(String[] args) {
    

    Pedido pedido = new Pedido(200.0, 5.0, 100.0, new FretreEconomico());
    System.out.println("total em R$" + pedido.calcularTotal());
    pedido.setFrete(new FretreExpresso());
    System.out.println("total em R$" + pedido.calcularTotal());
    pedido.setFrete(new Retirada());
    

}
    

}
