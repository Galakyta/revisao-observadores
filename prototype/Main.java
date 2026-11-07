package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Inimigo modelo = new Inimigo(
            "Goblin", 100, 
            new Arma("Adaga", 10),
            new ArrayList<>(List.of("Correr", "enfiar o dedo no cu e correr"))
        );
        
        Inimigo goblin1 = modelo.clonar();
        Inimigo goblin2 = modelo.clonar();

        goblin2.setNome("goblin adm");
        goblin2.setvida(300);
        goblin2.getArma().setDano(50);
        goblin2.getHabilidades().add("Gritar");

        System.out.println("Modelo:   " + modelo);
        System.out.println("Goblin 1: " + goblin1);
        System.out.println("Goblin 2: " + goblin2);
        System.out.println("modelo == goblin1? " + (modelo == goblin1));
        
    }

}
