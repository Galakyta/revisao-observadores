package singleton;


public class Main {
   public static void main(String[] args) {
     Sensor sensor = new Sensor();
     Alarme alarme = new Alarme();

    // no main eu so estancio os dois, e puxo as classes pra medir e disparar, elas ja checam se existe a instancia, por isso eu nao preciso declarar a chamada explicitamente

    

     sensor.medir();
     alarme.disparar();
     RegistroLogSingleton a = RegistroLogSingleton.getInstancia();
     RegistroLogSingleton b = RegistroLogSingleton.getInstancia();
     System.out.println("Mesma instancia? " + (a == b));

     a.mostrarHistorico();
     b.mostrarHistorico();
     
   }
}
