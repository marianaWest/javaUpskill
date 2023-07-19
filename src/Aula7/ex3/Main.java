package Aula7.ex3;

public class Main {
    public static void main(String[] args) {

        Jogador um = new Jogador("Ze", 1);
        um.marcaGolo();
        um.marcaGolo();
        System.out.println(um.toString());
        //System.out.println(um.totalGolos());


        GuardaRedes dois = new GuardaRedes("Joao", 2);
        dois.sofreGolo();
        dois.sofreGolo();
        dois.sofreGolo();
        System.out.println(dois.toString());

        JogadorDeCampo tres = new JogadorDeCampo("di Maria", 3);
        tres.fazPasse();
        tres.fazPasse();
        tres.fazPasse();
        tres.fazPasse();
        tres.recebePasse();
        tres.recebePasse();
        tres.recebePasse();
        tres.recebePasse();
        tres.recebePasse();
        System.out.println(tres.toString());

    }
}
