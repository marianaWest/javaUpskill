package Aula7.ex3;

public class GuardaRedes extends Jogador {
    private int golosSofridos;

    public GuardaRedes(String nome, int numero) {
        super(nome, numero);
//        this.golosSofridos = golosSofridos;
    }

    public int getGolosSofridos() {
        return golosSofridos;
    }

    public void sofreGolo() {
        golosSofridos++;
    }

    @Override
    public String toString() {
        return "GuardaRedes {" +
                "nome: " + super.getNome() +
                ", numero: " + super.getNumero() +
                ", golosSofridos = " + golosSofridos +
                '}';
    }
}


