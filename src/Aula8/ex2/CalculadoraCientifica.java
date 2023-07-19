package Aula8.ex2;

public class CalculadoraCientifica extends Calculadora {

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }
}
