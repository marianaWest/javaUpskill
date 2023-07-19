package Aula11.TA.ex3;

import Aula11.Direction;

public class Main {
    public static void main(String[] args) {
        DiaDaSemana dia = DiaDaSemana.TERCA;
        System.out.println(dia.isWeekend());
        System.out.println(dia.isWeekDay());
        dia.message(dia);

        DiaDaSemana dia1 = DiaDaSemana.SABADO;
        dia1.message(dia1);

        System.out.println("percorre o enum");
        DiaDaSemana[] diasDaSemana = DiaDaSemana.values();
        for (int i = 0; i < diasDaSemana.length; i++) {
           // System.out.println(diasDaSemana[i].isWeekDay());
            diasDaSemana[i].message(diasDaSemana[i]);
        }

    }
}
