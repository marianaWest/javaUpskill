package Aula6.ex3;

public class Rectangle {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int l) {
        this.a = l;
        this.b = l;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getArea() {
        return a * b;
    }

    public int getPerimetro() {
        return a * 2 + b * 2;
    }

    public double getDiagonal() {
        return Math.sqrt(a * a + b * b);
    }

    public boolean isSquare() {
        return a == b;
    }

}
