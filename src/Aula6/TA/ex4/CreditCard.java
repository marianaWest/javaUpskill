package Aula6.TA.ex4;

public class CreditCard {
    final String titular;
    private int numero;
    private int mes;
    private int ano;
    private int maximo;
    private int montanteGasto;
    private int saldo;


    public CreditCard(String titular, int numero, int mes, int ano, int maximo) {
        this.titular = titular;
        this.numero = numero;
        this.mes = mes;
        this.ano = ano;
        this.maximo = maximo;
    }

    private String ultimoMovimento = "";
    private String movimentos = "movimentos: ";
    public String getTitular() {
        return titular;
    }

    public void setMontanteGasto(int montanteGasto) {
        this.montanteGasto = montanteGasto;
    }

    public int getMontanteGasto() {
        return montanteGasto;
    }

    public int saldo() {
        ultimoMovimento = "saldo";
        saldo = maximo - montanteGasto;
        movimentos = movimentos + "saldo de " + saldo + ", ";
        return saldo;
     }

     public void pagarCredito(int pag) {
        ultimoMovimento = "credito pago";
        movimentos = movimentos + "pago: " + pag + ", ";
        montanteGasto = montanteGasto - pag;
     }

     public void gastar(int quantia, String descricao) {
        ultimoMovimento = "debito";
       movimentos = "gastos " + descricao + " " + quantia + ", ";
        montanteGasto = montanteGasto + quantia;
     }

     public String getUltimoMovimento() {
        return "ultimo movimento "+ ultimoMovimento;
     }
     public String getMovimentos() {
        return movimentos;
     }
}
