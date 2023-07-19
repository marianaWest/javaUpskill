package Aula7.ex2;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

public String imprimeLocalizacao() {
        return "a localizacao é " + this.localizacao;
}
}
