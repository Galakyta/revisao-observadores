package exemploDoClaude;

public class main {
public static void main(String[] args) {
    
 EstacaoMetereologica estacao = new EstacaoMetereologica();

 Observer tela = new DisplayTela();
 Observer log = new DisplayLog();
 Observer alerta = new DisplayAlerta();

 estacao.adicionarObserver(tela);
        estacao.adicionarObserver(log);
        estacao.adicionarObserver(alerta);

   System.out.println("--- Mudança 1 ---");
        estacao.setTemperatura(25.0);

        System.out.println("\n--- Mudança 2 ---");
        estacao.setTemperatura(38.5);

        // Removendo um observer
        estacao.removerObserver(log);

        System.out.println("\n--- Mudança 3 (sem o log) ---");
        estacao.setTemperatura(30.0);
}
}
