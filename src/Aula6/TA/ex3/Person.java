package Aula6.TA.ex3;

public class Person {
    final String nome;
    final int id;
    protected String morada;
    public Person(String nome, int id, String morada) {
        this.nome = nome;
        this.id = id;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getMorada() {
        return morada;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", morada='" + morada + '\'' +
                '}';
    }
}
