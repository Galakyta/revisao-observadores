package questao1;
import java.util.Scanner;
public class Produtos {

    Scanner scanner = new Scanner(System.in);
    public String nome;
    public int estoque;
    private int setEstoque(int estoque){
        this.estoque = estoque;
        return estoque;
    }
    public void atualizarEstoque(){
       int novoEstoque;
       System.out.println("Insira o novo valor do estoque: ");
       novoEstoque = scanner.nextInt();
       setEstoque(novoEstoque);
       System.out.println("Estoque atualizado para: " + novoEstoque);
    }

    

}
