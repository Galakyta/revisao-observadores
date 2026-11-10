package questao1;

public class Compras implements Observer {
    @Override 
    public void atualizar(Produto produto){
        if(produto.estoque < 5){
            System.out.println("Aviso, produto com estoque baixo: " + produto.estoque);
        }
    }
}
