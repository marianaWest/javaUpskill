package Aula7.ex1;

public class Empregados {
    private String nome;
    private int id;
    private double salario = 800.00;

    public Empregados(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }
}
