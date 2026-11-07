package strategy;
public class FretreExpresso implements CalculoFrete{
    double taxaUrgencia = 15;
    @Override 
public double calcular(double pesoKg, double distanciaKm){
    return (pesoKg * 3) + (distanciaKm * 0.30) + taxaUrgencia;
}
}
