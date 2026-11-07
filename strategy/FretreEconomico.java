package strategy;

public class FretreEconomico implements CalculoFrete {
@Override 
public double calcular(double pesoKg, double distanciaKm){
    return (pesoKg * 2) + (distanciaKm * 0.10);
}
}
