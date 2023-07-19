package Aula11.ex1;

public enum Calculadora {
    SOMAR, SUBTRAIR, MULTIPLICAR, DIVIDIR;

    public double calcular(double a, double b) {
        double result = 0;
        switch (this) {
            case SOMAR:
                result = a + b;
                break;
            case SUBTRAIR:
                result = a - b;
                break;
            case MULTIPLICAR:
                result = a * b;
                break;
            case DIVIDIR:
                result = a / b;
                break;
            default:
                System.out.println("wrong operator");
        } return result;
    }
}
