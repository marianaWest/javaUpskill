package Aula7.ex1;

public class Gerente extends Empregados {
    private boolean objetivosCumpridos;
    private double premio = 200;

    public Gerente(String nome, int id, boolean objetivosCumpridos) {
        super(nome, id);
        this.objetivosCumpridos = objetivosCumpridos;
    }

    @Override
    public double getSalario() {
        if(objetivosCumpridos) {
            return super.getSalario() + premio;
        }
        return super.getSalario();
    }
}
