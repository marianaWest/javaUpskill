package Aula6.TA.ex2;

public class Calculator {
    private double a;
    private double b;
    private double c;
    private String[] historico = new String[10];
    private String operacao = "";

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void alimentarHistorico() {
        for (int i = 0; i < historico.length; i++) {
            if (historico[i] == null) {
                historico[i] = operacao;
                break;
            }
        }
    }
    public double soma(double a, double b) {
        double resultado = a + b;
        operacao = "soma";
        alimentarHistorico();

        return resultado;
    }

    public double subtracao(double a, double b) {
        operacao = "subtracao";
        double resultado = a - b;
        alimentarHistorico();
        return resultado;
    }

    public double multiplicacao(double a, double b) {
        operacao = "multiplicacao";
        double resultado = a * b;
        alimentarHistorico();
        return resultado;
    }

    public double divisao(double a, double b) {
        operacao = "divisao";
        double resultado = a  / b;
        alimentarHistorico();
        return resultado;
    }

    public double potencia(double a, double b) {
        operacao = "potencia";
        double resultado = Math.pow(a, b);
        alimentarHistorico();
        return resultado;
    }

    public double resto(double a, double b) {
        operacao = "resto";
        double resultado = a % b;
        alimentarHistorico();
        return resultado;
    }

    public String resolvente(double a, double b, double c) {
        operacao = "resolvente";
        alimentarHistorico();

        if(a == 0)
        return "nao e expressao quadratica";
    double discriminante = b * b - 4 * a * c;
    if (discriminante < 0) {
        return "a expressao nao possui raizes reais";
    } else if (discriminante == 0) {
        double x = -b / (2 * a);
        return "o x é:" + x;
    } else {
        double x1 = (-b + Math.sqrt(discriminante)) / ( 2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }
    }
public String imprimirHistorico() {
        String resultado = "[";
            for (int i = 0; i < historico.length; i++) {
                if (i < historico.length - 1) {
                    resultado = resultado + historico[i] + ", ";
                } else {
                    resultado = resultado + historico[i] + "]";
            }
    }
            return resultado;
        }

    public String historicoParcial(int n) {
        String resultado = "[";
        for (int i = historico.length - n; i < historico.length; i++) {
            if (i < historico.length - 1) {
                resultado = resultado + historico[i] + ", ";
            } else {
                resultado = resultado + historico[i] + "]";
            }
        }
        return resultado;
    }
}
