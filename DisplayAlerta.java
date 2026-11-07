public class DisplayAlerta implements Observer {
    @Override 
    public void atualizar(double temperatura){
        if (temperatura > 35){
            System.out.println("calor extremo: " + temperatura);
        }
    }
}
