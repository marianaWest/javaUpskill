package Aula8.ex1;

public class Assistente extends Funcionario {

    public Assistente(String nome, String codigo) {
        super(nome, codigo);
    }

    @Override
    double calculaSalario() {
        return getSalarioBase();
    }
}
