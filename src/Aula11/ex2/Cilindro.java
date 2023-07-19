package Aula11.ex2;

public class Cilindro extends Circulo implements FiguraGeometricaTridimensional {
    public double altura;

    public Cilindro(double raio, double altura) {
        super(raio);
        this.altura = altura;
    }

    @Override
    public String getNomeFiguraGeometricaTridimensional() {
        return "Cilindro";
    }


    @Override
    public double getVolume() {
        return getArea() * altura;
    }
    //parei aqui
    @Override
    public double getArea() {
        return (getArea() * 2) + (2 * Math.PI * altura);
    }
}
