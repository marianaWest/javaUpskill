package Aula6.ex3;

import Aula6.ex2.Person;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 2);

        Rectangle square = new Rectangle(5);

        System.out.println(rectangle.getA());
        System.out.println(square.getA());

        System.out.println(square.getArea());

        System.out.println(square.getPerimetro());

        System.out.println(rectangle.isSquare());
    }
}
