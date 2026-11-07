package revisaomanual;
import java.util.ArrayList;
import java.util.List;

public class CanalDoTempo implements Subject {
    private final List<Observer> observadores = new ArrayList<>();
    private double kmh;

    //eu realmente nao gosto dessa porra de subject, pra mim é um nome muito ruim, "assunto / sujeito" qual assunto porra, sujeito ao que

    //pra começar, é necessario que a lista seja final para que ela não possa ser sobrescrita posteriormente
    //segunda mudança que eu decidi fazer pra minha logica mental, eu vou chamar essa lista de observadores pra ficar mais claro pra mim.
    // por algum motivo em ingles pra mim eles soam mais como tipos sla pq, em portugues pra observadores fica melhor

    //ok vamo la, algumas coisas importantes, eu nao tenho tanta experiencia assim usando list e Array em java mas achei a biblioteca boa ate
    //faz mt tempo que eu nao uso mas é simples

    @Override 
    public void pingarObservadores(){
        for(Observer observer : observadores){
        observer.atualizar(kmh);
        }
    }

    // para todos observer de observadores que é minha Array list, eles atualizam os kmh
    // e ja é bom delimitar que o atualizar so pinga, e nao faz mais nada, o resto das implementacoes ficam todas nos endpoints.

    @Override 
    public void inscrever(Observer observer){
        observadores.add(observer);
    }

    //cara eu achei isso aqui tao gostoso, só add e remove, acho que eu ja tinha visto isso antes mas ficou mais na minha memoria o INFERNO que era ficar manejando lista em c
    // nas materias de estrutura de dados, eu curto muito low level justamente pq vc depende muito de principios logicos e matematicos fundamentais mas pqp as vzs só quer uma lista

    @Override 
    public void desinscrever(Observer observer){
        observadores.remove(observer);
    }

    //msm coisa

    public void setarKmh(double kmh){
        this.kmh = kmh;
        pingarObservadores();
    }
   //aq eu achei legal tmbm, mas eu nao consigo vizualizar ainda a melhor forma de nomear o que eu vou pingar aqui quando eu seto os kmh
    
}
