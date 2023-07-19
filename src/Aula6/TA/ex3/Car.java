package Aula6.TA.ex3;

public class Car {
    final String marca;
    final String modelo;
    // private int lugares;
    final int matricula;
    final int mesRegisto;
    final int anoRegisto;
    private double consumo100km;
    final double capacidadeMaxima;
    private double capacidadeAtual;
    private boolean isLigado;
    private Person proprietario;

    public Car(String marca, String modelo, int matricula, int anoRegisto, int mesRegisto, double capacidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anoRegisto = anoRegisto;
        this.mesRegisto = mesRegisto;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getAnoRegisto() {
        return anoRegisto;
    }

    public int getMesRegisto() {
        return mesRegisto;
    }

    public void setConsumo100km(double consumo100km) {
        this.consumo100km = consumo100km;
    }

    public double getConsumo100km() {
        return consumo100km;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeAtual(double capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public double getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public String encherDeposito() {
        double faltam = capacidadeMaxima - capacidadeAtual;
        return "Faltam " + faltam + " litros no tanque." ;
    }

    public double run() {
        capacidadeAtual =  capacidadeAtual - consumo100km / 100;
        return capacidadeAtual;
    }

    public String isLigado(boolean isLigado) {
        if (isLigado)
            return "O carro está ligado";
        else
            return "O carro está desligado.";
    }

    public void setProprietario(Person proprietario) {
        this.proprietario = proprietario;
    }

    public Person getProprietario() {
        return proprietario;
    }

    public String getNomeProprietario() {
        return proprietario.getNome();
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula=" + matricula +
                ", mesRegisto=" + mesRegisto +
                ", anoRegisto=" + anoRegisto +
                ", consumo100km=" + consumo100km +
                ", capacidadeMaxima=" + capacidadeMaxima +
                ", capacidadeAtual=" + capacidadeAtual +
                ", proprietario atual= " +
                 getNomeProprietario() +
                '}';
    }
}
