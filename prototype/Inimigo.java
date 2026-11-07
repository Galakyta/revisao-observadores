package prototype;
import java.util.ArrayList;
import java.util.List;

public class Inimigo implements Prototipo<Inimigo> {

private String nome;
private int vida;
private Arma arma;
private List<String> habilidades;


public Inimigo(String nome, int vida, Arma arma, List<String> habilidades){
    this.nome = nome;
    this.vida = vida;
    this.arma = arma;
    this.habilidades = habilidades;
}

private Inimigo(Inimigo original){
     this.nome = original.nome;
    this.vida = original.vida;
    this.arma = new Arma(original.arma);
    this.habilidades = new ArrayList<>(original.habilidades);
}

@Override 
public Inimigo clonar(){
    return new Inimigo(this);
}

public void setNome(String nome){
    this.nome = nome;
}

public void setvida(int vida){
    this.vida = vida;
}

public Arma getArma(){
    return arma;
}
public List<String> getHabilidades(){
    return habilidades;
}

@Override 
public String toString(){
    return nome + "vida = " + vida + "/" + arma + "/" + habilidades; 
}


}
