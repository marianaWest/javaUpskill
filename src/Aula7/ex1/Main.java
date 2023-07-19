package Aula7.ex1;

public class Main {
    public static void main(String[] args) {
        Empregados[] emp  = new Empregados[5];

        emp[0] = new Empregados("pedro", 123);
        emp[1] = new Gerente("maria", 456, true);
        emp[2] = new Gerente("ze", 45, false);
        emp[3] = new Diretor("ana", 23, 4552.98);
        emp[4] = new Diretor("joao", 45, 121234.08);

        double soma = 0;
        for (Empregados e: emp) {
            System.out.println(e.getSalario());
           soma = soma + e.getSalario();
        }
        System.out.println("total de salarios: " + soma);
    }
}
