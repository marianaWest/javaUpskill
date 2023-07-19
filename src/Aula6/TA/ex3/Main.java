package Aula6.TA.ex3;

public class Main {
    public static void main(String[] args) {
        Car carro = new Car("Volkswagen", "Fusca", 1234, 2000, 2, 60);
       // System.out.println(carro.toString());
        carro.setCapacidadeAtual(40);
        System.out.println(carro.encherDeposito());
        carro.setConsumo100km(7.4);
        System.out.println(carro.run());
        System.out.println(carro.getCapacidadeAtual());
        carro.run();
        System.out.println(carro.getCapacidadeAtual());
        System.out.println(carro.isLigado(false));

        Person pessoa = new Person("Maria", 123, "rua tal");
        System.out.println(pessoa.toString());

        carro.setProprietario(pessoa);
        System.out.println(carro.getProprietario());

        System.out.println(carro.toString());

    }
}
