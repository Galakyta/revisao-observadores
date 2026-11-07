package prototype;

public class Arma {
private String nome;
private int dano;

public Arma(String nome, int dano){
    this.nome = nome;
    this.dano = dano;
}

//construtor de copia?

public Arma(Arma outra){
    this.nome = outra.nome;
    this.dano = outra.dano;
}

public void setDano(int dano){
    this.dano = dano;
}

@Override 

public String toString(){
    return nome + " dano " + dano;
}

}
