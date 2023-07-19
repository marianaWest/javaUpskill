package Aula6.TA.ex2;

public class Main {
    public static void main(String[] args) {

        Calculator first = new Calculator(3, 5);
        System.out.println(first.getA());

        first.setA(4.5);
        System.out.println(first.getA());

        System.out.println(first.soma(4, 9));
        System.out.println(first.soma(4, 9));

        System.out.println(first.subtracao(10, 5));
        System.out.println(first.multiplicacao(2.4, 8));
        System.out.println(first.divisao(4, 9));
        System.out.println(first.potencia(3, 5));
        System.out.println(first.resto(10, 3));

        first.setC(4);

        System.out.println(first.resolvente(1, 4, -21));
        System.out.println(first.imprimirHistorico());

        System.out.println(first.historicoParcial(3));
    }
}
