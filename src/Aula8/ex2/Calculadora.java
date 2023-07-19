package Aula8.ex2;

public abstract class Calculadora {

    public double soma(double a, double b) {
        return a + b;
    };
    public  double subtracao(double a, double b) {
        return a - b;
    };
    public double multiplicacao(double a, double b) {
        return a * b;
    }
    public double divisao(double a, double b) {
        return a / b;
    }

    public abstract double raizQuadrada(double a);
}
