package Aula6.TA.ex1;

public class Main {
    public static void main(String[] args) {
    Musica one = new Musica("Reebok or Nike", 2.32);
    Musica two = new Musica("Musica 2", 3.45);
    Musica three = new Musica("Musica 3", 10.0);
    Musica four = new Musica("Turn around", 4.90);
    Musica five = new Musica("Bright Eyes", 4.90);

    Playlist first = new Playlist(4);

    System.out.println(first.getCapacidade());
        first.setCapacidade(5);
        System.out.println(first.getCapacidade());

        first.adicionarMusica(one);
        first.adicionarMusica(two);
        first.adicionarMusica(three);
        first.adicionarMusica(four);
        // fora do vetor
        first.adicionarMusica(five);
        first.listaMusicas();

        System.out.println("///////");
        first.removerMusica("Musica 2");
        first.listaMusicas();

        System.out.println(first.duracaoTotal());
    }
}
