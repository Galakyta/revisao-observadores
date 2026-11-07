package revisaomanual;

public class endpointCWB implements Observer {
     @Override 
    
    public void atualizar(double kmh){
        if(kmh >= 80){
            System.out.println("VAMO PRO COUTO ENFIA OS DEDO NO CU DO ATLETICO CARAI");
        }
    }
}
