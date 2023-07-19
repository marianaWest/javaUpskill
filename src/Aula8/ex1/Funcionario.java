package Aula8.ex1;

public abstract class Funcionario {
    private String nome;
    private String codigo;
    private double salarioBase = 200;


    public Funcionario(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    };

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    abstract double calculaSalario();

}
