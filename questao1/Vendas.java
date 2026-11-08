package questao1;

public class Vendas implements Observer {
    private int ultimoEstado;
    @Override 
    public void atualizar(Produtos produto){
        if(produto.estoque >= 0){
            ultimoEstado = produto.estoque;
        }
        if(ultimoEstado <=  0 || produto.estoque > 0){
            System.out.println("Aviso, produto voltou ao estoque: " + produto.estoque);
        }
    }
}
