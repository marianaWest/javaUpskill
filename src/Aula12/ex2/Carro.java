package Aula12.ex2;

public class Carro {
    private String matricula;
    private String marca;
    private int anoVenda;

    public Carro(String matricula, String marca, int anoVenda) {
        this.matricula = matricula;
        this.marca = marca;
        this.anoVenda = anoVenda;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoVenda() {
        return anoVenda;
    }

    public void setAnoVenda(int anoVenda) {
        this.anoVenda = anoVenda;
    }

    @Override
    public String toString() {
        return "Carro { " +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", anoVenda=" + anoVenda +
                '}';
    }
}
