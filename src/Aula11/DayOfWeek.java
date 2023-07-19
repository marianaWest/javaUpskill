package Aula11;

public enum DayOfWeek {
    SEGUNDA ("Segunda-feira"),
    TERCA ("Terça-feira"),
    QUARTA ("Quarta-feira"),
    QUINTA ("Quinta-feira"),
    SEXTA ("Sexta-feira"),
    SABADO ("Sábado"),
    DOMINGO ("Domingo");

    private final String prettyNameDay;

    DayOfWeek(String prettyName) {
    this.prettyNameDay = prettyName;
    }

    @Override
    public String toString() {
        return prettyNameDay;
    }
}
