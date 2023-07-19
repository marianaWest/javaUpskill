package Aula7.ex3;

public class JogadorDeCampo extends Jogador {
    private int passesFeitos;
    private int passesRecebidos;

    public JogadorDeCampo(String nome, int numero) {
        super(nome, numero);
    }

    public int getPassesFeitos() {
        return passesFeitos;
    }

    public int getPassesRecebidos() {
        return passesRecebidos;
    }

    public void recebePasse() {
        passesRecebidos++;
    }

    public void fazPasse() {
        passesFeitos++;
    }

    @Override
    public String toString() {
        return "JogadorDeCampo {" +
                "nome: " + super.getNome() +
                ", numero: " + super.getNumero() +
                ", passesFeitos=" + passesFeitos +
                ", passesRecebidos=" + passesRecebidos +
                '}';
    }
}
