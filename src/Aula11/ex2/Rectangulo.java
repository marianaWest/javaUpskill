package Aula11.ex2;

public class Rectangulo implements FiguraGeometricaPlana {
public double lado1;
public double lado2;



    @Override
    public double getArea() {
        return lado1 * lado2;
    }

    @Override
    public double getPerimetro() {
        return (lado1 * 2) * (lado2 * 2);
    }

    @Override
    public String getNomeFiguraGeometricaPlana() {
        return "Rectangulo";
    }
}
