package questao1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Produto implements Subject{

    private final List<Produto> produtos = new ArrayList<>();
    private final String nome;
    private int estoque;
    public Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getNome() {
         return nome; }
    public int getEstoque() {
         return estoque; }
    Scanner scanner = new Scanner(System.in);

    private void setEstoque(int novoEstoque){
        if(novoEstoque == this.estoque){
        return;
        }
        this.estoque = novoEstoque;
        pingarObservadores();
    }
    public void atualizarEstoque(){
       int novoEstoque;
       System.out.println("Insira o novo valor do estoque: ");
       novoEstoque = scanner.nextInt();
       setEstoque(novoEstoque);
       System.out.println("Estoque atualizado para: " + novoEstoque);
    }

    

}
