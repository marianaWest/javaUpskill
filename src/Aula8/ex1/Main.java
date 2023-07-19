package Aula8.ex1;

public class Main {
    public static void main(String[] args) {
        Funcionario um = new Assistente("Zé", "123");
        um.setSalarioBase(900);
        System.out.println(um.calculaSalario());

        Funcionario dois = new Gerente("João", "234");
        System.out.println(dois.calculaSalario());

        Funcionario tres = new Vendedor("Maria", "1010", 0.1);
        System.out.println(tres.calculaSalario());
    }
}
