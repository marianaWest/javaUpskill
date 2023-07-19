package Aula8.ex3;

public class Main {
    public static void main(String[] args) {
        CartaoPresente namorados = new DiaDosNamorados("ana");
        namorados.showMessage();

        CartaoPresente natal = new Natal("Luisa");
        natal.showMessage();

        CartaoPresente aniversario = new Aniversario("João");
        aniversario.showMessage();
    }
}
