package src;

import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {
        int inteiro = round(32.32);
        System.out.println(inteiro);

        getTemperature(32);

        printNumber(4);

       // numberPosNeg();

        maxValue();

    }

    public static int round(double n) {
      int inteira = (int) n;
      double decimal = n - inteira;
      if (decimal < 0.5) {
          return inteira;
      } else {
          return inteira + 1;
      }
    }

    public static void getTemperature(int temperature) {
        if (temperature < 0) {
            System.out.println("Está gelado");
        } else if (temperature > 0 && temperature < 15) {
            System.out.println("Está frio");
        } else if (temperature > 50 && temperature <= 80) {
            System.out.println("Está quente");
        } else if (temperature > 80) {
            System.out.println("Está a ferver");
        } else {
            System.out.println("Está normal");
        }
        }

        public static void printNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Não consigo imprimir");
        }
        }

        public static void numberPosNeg() {
            System.out.println("diga um numero");
            Scanner keyboard = new Scanner(System.in);
            int number = keyboard.nextInt();
        if (number < 0) {
            System.out.println("O numero é negativo");
        }
        if (number == 0) {
            System.out.println(" O numero é zero");
        }
        if (number > 0) {
            System.out.println("O numero é positivo");
        }
        }

        public static void maxValue() {
            Scanner in = new Scanner(System.in);
            System.out.println("diga um número");
            int number1 = in.nextInt();
            System.out.println("diga um número");
            int number2 = in.nextInt();
            System.out.println("diga um número");
            int number3 = in.nextInt();

            if (number1 > number2 && number1 > number3) {
                System.out.println(number1);
            } else if (number2 > number3) {
                System.out.println(number2);
            } else {
                System.out.println(number3);
            }

        }
}
