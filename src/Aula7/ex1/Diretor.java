package Aula7.ex1;

public class Diretor extends Empregados {

private double lucro;

public Diretor(String nome, int id, double lucro) {
    super(nome, id);
    this.lucro = lucro;
}
@Override
public double getSalario() {
    return super.getSalario() * 2 + lucro * 0.01;

}
}
