package exemploDoClaude;
import java.util.ArrayList;
import java.util.List;

public class EstacaoMetereologica implements Subject {
private final List<Observer> observers = new ArrayList<>();
private double temperatura;

@Override
public void adicionarObserver(Observer observer){
    observers.add(observer);
}

@Override
public void removerObserver(Observer observer){
    observers.remove(observer);
}

@Override
public void notificarObservers(){
    for (Observer observer : observers){
        observer.atualizar(temperatura);
    }
}

public void setTemperatura(double temperatura){
    this.temperatura = temperatura;
    notificarObservers();
}


}
