package adapter;

public class PagamentoPix implements ProcessadorPagamento {
    @Override 
    public void pagar(double valor){
        System.out.println("Pix pagamento de R$: " + valor + "aprovado");
    }
}