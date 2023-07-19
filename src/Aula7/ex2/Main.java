package Aula7.ex2;

public class Main {
    public static void main(String[] args) {
       Ingresso normal = new Ingresso(100);
        System.out.println(normal.getValor());

        System.out.println(normal.imprimeValor());

        Vip vip = new Vip(100, 20);
        System.out.println(vip.getValor());
        System.out.println(vip.imprimeValor());

        CamaroteInferior um = new CamaroteInferior(100, 20, "A");
        System.out.println(um.imprimeLocalizacao());

        CamaroteSuperior dois = new CamaroteSuperior(100, 40, "B", 30);
        System.out.println(dois.imprimeLocalizacao());
    }
}
