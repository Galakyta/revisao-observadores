package questao1;

import java.util.ArrayList;
import java.util.List;

public class Loja implements Subject{

    private final List<Observer> observadores = new ArrayList<>();

    private final List<Produtos> produtos = new ArrayList<>();
    

    Produtos produto;

    @Override 
    public void inscrever(Observer observer){
        observadores.add(observer);
    }
    @Override
    public void desinscrever(Observer observer){
        observadores.remove(observer);
    }
    @Override 
    public void pingarObservadores(){
        for(Observer observer : observadores){
            observer.atualizar(produto);
        }
    }

    public void adicionarProduto(Produtos produto){
        produtos.add(produto);
    }

    public void removerProduto(Produtos produto){
        produtos.remove(produto);
    }

    public void listarProdutos(){
        for(Produtos produto : produtos){
            System.out.println(produto.nome + " // " + produto.estoque);
        }
    }

    public void alterarEstoque(Produtos produto){
         produto.atualizarEstoque();
         pingarObservadores();
    }

}
