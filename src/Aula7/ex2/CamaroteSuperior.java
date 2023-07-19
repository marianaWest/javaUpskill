package Aula7.ex2;

public class CamaroteSuperior extends CamaroteInferior {
    private double valorAdicionalCamarote;

    CamaroteSuperior(double valor, double valorAdicional, String localizacao, double valorAdicionalCamarote) {
        super(valor, valorAdicional, localizacao);
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public void setValorAdicionalCamarote(double valorAdicionalCamarote) {
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public double getValorAdicionalCamarote() {
        return valorAdicionalCamarote;
    }
}
