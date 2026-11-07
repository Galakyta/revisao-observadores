package revisaomanual;

public interface Subject {
//colocar public em uma interface é redundante mas eu peguei costume, mas é desnecessario
public void pingarObservadores();
public void inscrever(Observer observadador);
public void desinscrever(Observer observador);
    
}
