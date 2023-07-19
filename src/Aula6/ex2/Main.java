package Aula6.ex2;

public class Main {
    public static void main(String[] args) {
        Person joao = new Person("João", "Silva", 20);
        System.out.println(joao.getFirstName());
        joao.setLastName("Santos");
        System.out.println(joao.getLastName());
        System.out.println(joao.getAge());


        Person maria = new Person("Maria", "Joana", 22);
        System.out.println(maria.getFirstName());

        System.out.println(joao.toString());

    }
}
