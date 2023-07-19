package Aula12.ex2;

import Aula12.ex1.Contacto;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String, String> carros = new HashMap<String, String>();

        carros.put("0123", "Fusca");
        carros.put("1234", "Kombi");
        carros.put("2345", "Mini");
        carros.put("3456", "Smart");

        Carro volvo = new Carro("34678", "Volvo", 1990);

        System.out.println(carros);

        carros.remove("1234");

        System.out.println("removed");
        System.out.println(carros);

        for (String i : carros.keySet()) {
            System.out.println(i);
        }
        System.out.println("********");
        System.out.println(carros.get("3456"));

        System.out.println("********");
        for (String i : carros.values()) {
            System.out.println(i);
        }
// nao funciona porque o argumento e string
          //  carros.put(volvo.getMatricula(), volvo);
        System.out.println("********");


    }
}
