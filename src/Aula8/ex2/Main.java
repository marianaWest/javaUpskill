package Aula8.ex2;

public class Main {
    public static void main(String[] args) {
        Calculadora um = new CalculadoraCientifica();
        System.out.println(um.subtracao(3, 1));

        System.out.println(um.raizQuadrada(16.0));

        um = (CalculadoraCientifica) um;

        System.out.println(((CalculadoraCientifica) um).potencia(10, 2));

    }
}
