package Aula12.TA.ex2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Casa minhaCasa = new Casa();

        Eletrodomestico tv = new Eletrodomestico("televisao", "LG", 1000);
        Eletrodomestico lavaSeca = new Eletrodomestico("lava e seca", "Bosch", 900);
        Eletrodomestico roomba = new Eletrodomestico("aspirador de pó", "Roomba", 400);
        Eletrodomestico lavaLouca = new Eletrodomestico("lava louça", "GE", 300);

        minhaCasa.inserirEletrodomestico("sala", tv);
        minhaCasa.inserirEletrodomestico("sala", roomba);
        minhaCasa.inserirEletrodomestico("quarto", lavaSeca);
        minhaCasa.inserirEletrodomestico("quarto", lavaLouca);

        System.out.println(minhaCasa.toString());
    }
}
