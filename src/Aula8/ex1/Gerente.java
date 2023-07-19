package Aula8.ex1;

public class Gerente extends Funcionario {

    public Gerente(String nome, String codigo) {
        super(nome, codigo);
    }

    @Override
    double calculaSalario() {
        return getSalarioBase() * 2;
    }
}





