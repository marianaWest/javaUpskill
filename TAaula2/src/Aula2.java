package src;

import java.text.DecimalFormat;

public class Aula2 {
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double square(double num) {
        return Math.pow(num, 2);
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static double average(double num1, double num2) {
        return (num1 + num2)/2;
    }

    public static double rectArea(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double FtoC(double F) {
        return ((F - 32) * 5) / (double)9;
    }

    public static double CtoK(double c) {
        return c + 273.15;
    }

    public static double cToInch(double cm) {
        return cm * 0.39;
    }

    public static double iva(double price) {
        return price * 0.23;
    }

    public static double round(double number) {
        return Math.round(number);
    }

    public static double circlePerimeter(double r) {
        return 2 * Math.PI * r;
    }

    public static double areaPrisma(double largura, double altura, double comprimento) {
        return (altura * largura * 2) + (altura * comprimento * 4);
    }

   public static double roundToTwoDecimals(double num) {
        num = Math.round(num * 100);
        return num/100.00;
   }

   public static double numeroCasas(double num, int numCasas) {
        double multiplicador = Math.pow(10, numCasas);
        num = Math.round(num * multiplicador);
        return num/multiplicador;

   }

    public static void main(String[] args) {
        double resultSum = sum(2.5, 3.4);
        System.out.println(resultSum);

        double resultSquare = square(2.2);
        System.out.println(resultSquare);

        double resultDifference = difference(4, 3);
        System.out.println(resultDifference);

        double resultAverage = average(3.3, 5.8);
        System.out.println(resultAverage);

        double resultRectArea = rectArea(4, 5);
        System.out.println(resultRectArea);

        double FtoC = FtoC(100);
        System.out.println(FtoC);

        double CtoK = CtoK(20);
        System.out.println(CtoK);

        double cmToIn = cToInch(5);
        System.out.println(cmToIn);

        double iva = iva(200);
        System.out.println(iva);

        double round = round(5.7);
        System.out.println(round);

        double circumference = circlePerimeter(2.5);
        System.out.println(circumference);

        double areaPrisma = areaPrisma(4, 5.5, 7);
        System.out.println(areaPrisma);

        System.out.println(roundToTwoDecimals(6.3415145));

        double numeroCasas = numeroCasas(4.56789, 4);
        System.out.println(numeroCasas);

    }
}
