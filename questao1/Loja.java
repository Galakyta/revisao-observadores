package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {

    private final List<Observer> observadores = new ArrayList<>();
    private final String nome;
    private int estoque;

    public Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getNome() { return nome; }
    public int getEstoque() { return estoque; }

    public void setEstoque(int novoEstoque) {
        if (novoEstoque == this.estoque) return;   // RQ1.4: não mudou, não avisa
        this.estoque = novoEstoque;
        pingarObservadores();                      // RQ1.3: avisa quem está inscrito neste produto
    }

    @Override
    public void inscrever(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void desinscrever(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void pingarObservadores() {
        for (Observer observer : observadores) {
            observer.atualizar(this);              // o próprio produto se manda, sem "qual produto?"
        }
    }
}