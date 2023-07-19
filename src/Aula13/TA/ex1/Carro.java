package Aula13.TA.ex1;

public class Carro {
    private String matricula;
    private String nome;
    private String reparacao;
    private double valor;

    public Carro(String matricula, String nome, String reparacao, double valor) {
        this.matricula = matricula;
        this.nome = nome;
        this.reparacao = reparacao;
        this.valor = valor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReparacao() {
        return reparacao;
    }

    public void setReparacao(String reparacao) {
        this.reparacao = reparacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return matricula + ";" +
               nome + ";" +
               reparacao + ";" +
                + valor;
    }
}
