package Aula11.TA.ex3;

public enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    public boolean isWeekDay() {
        switch (this) {
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA:
                return true;
            case SABADO, DOMINGO:
                return false;
        } return false;
    }

    public boolean isWeekend() {
        switch (this) {
            case SABADO, DOMINGO:
                return true;
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA:
                return false;
        } return false;
    }

    // OR if (isWeekDay()) return false; else return true;

public void message(DiaDaSemana dia) {
       if(isWeekDay()) {
           System.out.println("Wake up!");
       } else {
           System.out.println("sleep");
       }
}
}
