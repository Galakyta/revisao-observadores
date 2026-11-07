package exemploDoClaude;
public class DisplayTela implements Observer{
    @Override 
    public void atualizar(double temperatura){
        System.out.println("temperatura atual: " + temperatura + "celcios russoumamnos");
    }
}
