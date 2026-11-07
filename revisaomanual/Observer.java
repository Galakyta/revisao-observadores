package revisaomanual;

public interface Observer {
public void atualizar(double kmh);
//ventania

//ok agora trabalhando na ordem logica
/*primeiro passo fazer a public interface do Observer, que é quem vai ser extendida pelos endpoints
em seguida a gente faz o gerenciador dos metodos do observer que é o subject enquanto eu nao tenho um nome melhor

só depois disso a gente vai pra classe principal pro fluxo que é  a implementacao dos metodos do subject, que nesse caso é o meu canal do tempo
ali voce implementa primeiramente a lista de todos os observers.

em seguida o ping dos observers o inscrever e desinscrever.

o ping vai ser só vc chamar o atualizar para todos os observadores inscritos na lista, o add e o remove é auto explicativo, muito simples.

 ai sim voce pode ir pro gatilho de atualizacao, ISSO GATILHO PORRA GATILHO OTIMO NOME, e esse gatilho nese caso foi os kmh, que quando voce atualizar
 vc chama o ping, e todos sao pingados, ai em cada endpoint voce implementa o comportamento depois de que ele é atualizado.
 
 na sua main vc so vai precisar entao instanciar o seu gerente(subject concreto) e colocar geral na lista dele, assim toda vez que ele for atualizado geral da lista é chamado.
 e executa um comportamento se for pertinente.*/
}
