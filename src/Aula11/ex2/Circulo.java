package Aula11.ex2;

public class Circulo implements FiguraGeometricaPlana {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String getNomeFiguraGeometricaPlana() {
        return "Círculo";
    }
}
