package questao1;

public class Auditoria implements Observer {
    @Override
    public void atualizar(Produto produto){
        if(produto != null){
            System.out.println("Operação detectada, estoque em: " + produto.estoque);
        }
    }

}
