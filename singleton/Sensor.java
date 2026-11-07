package singleton;

public class Sensor {
    public void medir(){
        RegistroLogSingleton.getInstancia().registrar("o invocador suporte disse: smt");
        //aq o meu sensor puxa o registroLogSingleton e usa o getInstancia pra criar ou so pedir, e registrar nele
    }
}
