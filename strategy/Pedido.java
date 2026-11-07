package strategy;

public class Pedido {
private final double valorProdutos;
private final double pesoKg;
private final double distanciaKm;
private CalculoFrete frete;

public Pedido(double ValorProdutos, double pesoKg, double distanciaKm, CalculoFrete frete){
    this.valorProdutos = ValorProdutos;
    this.pesoKg = pesoKg;
    this.distanciaKm = distanciaKm;
    this.frete = frete;
}

public void setFrete(CalculoFrete frete){
    this.frete = frete;
}

public double calcularTotal(){
    double valorFrete = frete.calcular(pesoKg, distanciaKm);
    System.out.println("frete R$: " + valorFrete);
    return valorProdutos + valorFrete;
}



}
