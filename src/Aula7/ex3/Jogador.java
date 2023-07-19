package Aula7.ex3;

public class Jogador {
    private String nome;
    private int numero;

    private int golosMarcados;

    //teste
    private int totalGolos = 0;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getGolosMarcados() {
        return golosMarcados;
    }

    public void marcaGolo() {
        golosMarcados++;
}

// teste

    public int totalGolos(int totalGolos) {
        this.totalGolos = totalGolos;
        return totalGolos + golosMarcados;
    }

    public int getTotalGolos() {
        return totalGolos;
    }

    @Override
    public String toString() {
        return "Jogador {" +
                "nome= '" + nome + '\'' +
                ", numero = " + numero + '\'' +
                ", golos marcados = " + golosMarcados +
                '}';
    }
}
