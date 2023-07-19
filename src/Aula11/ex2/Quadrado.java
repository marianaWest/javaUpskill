package Aula11.ex2;

public class Quadrado implements FiguraGeometricaPlana {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimetro() {
        return lado * 4;
    }

    @Override
    public String getNomeFiguraGeometricaPlana() {
       return "Quadrado";
    }

    @Override
    public String toString() {
        return "Quadrado";
    }
}
