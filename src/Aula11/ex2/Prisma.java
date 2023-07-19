package Aula11.ex2;

public class Prisma extends Quadrado implements FiguraGeometricaTridimensional {
    private double altura;

    public Prisma(int lado, double altura) {
    super(lado);
    this.altura = altura;
    }

    @Override
    public String getNomeFiguraGeometricaTridimensional() {
        return "Prisma";
    }

    @Override
    public double getVolume() {
        return getArea() * altura;
    }
}
