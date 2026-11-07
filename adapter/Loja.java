package adapter;

public class Loja {
private final  ProcessadorPagamento processador;

public Loja(ProcessadorPagamento processador){
    this.processador = processador;
}

public void finalizarCompra(Double valor){
    System.out.println("Finalizando compra de R$ " + valor);
    processador.pagar(valor);
}

}
