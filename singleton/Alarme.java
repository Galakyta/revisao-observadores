package singleton;
public class Alarme {
    public void disparar(){
        RegistroLogSingleton.getInstancia().registrar("partida terminada pelo vanguard, cheater detectado");
        //mesma coisa aqui, bem simples.
        // dessa forma fica facil trabalhar em cima disso 
    }
}
