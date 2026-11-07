package singleton;

import java.util.ArrayList;
import java.util.List;
public class RegistroLogSingleton {
    private static RegistroLogSingleton instancia;

    private final List<String> mensagens = new ArrayList<>();


    /*provavelmente a forma com que eu vou explicar isso é bem reprovavel, mas eu to imaginando  um monolito, e tudo que gira em torno dele.
    primeiro que so pode existir 1 monolito, pediu o monolito é sempre aquele, e pra isso que serve o private registrolog, justamente pra nao ter como instanciar um diferente
    em seguida a gente faz o get instancia, que serve como o nosso access point pro monolito, com a logica delefica muito mais facil trabalhar, ja que se o monolito for null
    nn tem nenhum, e dai e so retornar um novo, se tiver, retorna o mesmo, e sempre assim ja que nao tem como fazer nada sem ele.
    
    nesse caso o monolito ta guardando o nosso historico, que é a minha list de mensagens.

    e qualquer um pode chamar o registrar pra mandar isso pros logs

    e qualquer um pode chamar e mostrar o historico dos logs
    */

    private RegistroLogSingleton(){
        System.out.println("registro log criado, é pra aparecer somente e unicamente 1 vez");
    }

    public static synchronized RegistroLogSingleton getInstancia(){
    if(instancia == null){
        instancia = new RegistroLogSingleton();
    }
    return instancia;
    }

    public void registrar(String mensagem){
        mensagens.add(mensagem);
        System.out.println("[LOG] pegamo vc no pulo: " + mensagem);
    }

    public void mostrarHistorico(){
        System.out.println("Historico: " + mensagens.size());
        for (String m : mensagens){
            System.out.println(m);
        }
    }
}
