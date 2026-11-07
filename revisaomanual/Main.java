package revisaomanual;

public class Main {
    public static void main(String[] args) {
        CanalDoTempo canalDoTempo = new CanalDoTempo();
        Observer CL = new endpointCL();
        Observer CWB = new endpointCWB();
        Observer LOG = new endpointLOG();

        canalDoTempo.inscrever(LOG);
        canalDoTempo.inscrever(CWB);
        canalDoTempo.inscrever(CL);


        //so com o log
        canalDoTempo.setarKmh( 60);

        canalDoTempo.setarKmh(90);

        //sem curitoba
        canalDoTempo.desinscrever(CWB);

        canalDoTempo.setarKmh(100);
    }
    
}
