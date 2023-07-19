package Aula8.ex1;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String codigo, double comissao) {
        super(nome, codigo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    double calculaSalario() {
        return getSalarioBase() + getSalarioBase() * comissao;
    }
}
