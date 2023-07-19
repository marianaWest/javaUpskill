package Aula6.TA.ex4;

public class Main {
    public static void main(String[] args) {

        CreditCard cartao = new CreditCard("Maria", 123123123, 1, 2024, 2000);
        cartao.setMontanteGasto(900);
        System.out.println(cartao.saldo());

       cartao.pagarCredito(200);
        System.out.println(cartao.getUltimoMovimento());

        cartao.gastar(50, "jantar");
        System.out.println(cartao.getMontanteGasto());
        System.out.println(cartao.getUltimoMovimento());

        System.out.println(cartao.getMovimentos());
        System.out.println(cartao.getUltimoMovimento());

        cartao.pagarCredito(30);
        System.out.println(cartao.getMovimentos());

        cartao.pagarCredito(20);
        System.out.println(cartao.getMovimentos());



    }
}
