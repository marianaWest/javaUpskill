package MiniTeste;

public class Teste {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("xxxx");
            i++;
        } while (i < 1);

        int k = 0;
        while(k < 1) {
            System.out.println("yyyyy");
            k++;
        }
        int soma = 0;
        int j = 0;
        while (j < 20) {
            soma = soma + j;
            j++;
            if (soma >= 100) {
                break;
            }
        }
        System.out.println(soma);
    }
}
