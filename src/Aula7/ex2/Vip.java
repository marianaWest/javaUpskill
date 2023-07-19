package Aula7.ex2;

public class Vip extends Ingresso {
    private double valorAdicional;
    public Vip (double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public double getValor() {
        return super.getValor() + this.valorAdicional;
    }

    @Override
    public String imprimeValor() {
        return "o ingresso VIP é:" + this.getValor();
    }
}
