package Aula7.ex2;

public class Ingresso {
    private double valor;
    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String imprimeValor() {
        return "o valor é: " + valor;
    }
}
