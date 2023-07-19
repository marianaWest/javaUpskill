package Aula13.ex3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movimento movimento1 = new Movimento("almoço", 12);
        Movimento movimento2 = new Movimento("lanche", 5);
        Movimento movimento3 = new Movimento("jantar", 20);

        ContaBancaria newConta = new ContaBancaria("Mariana", 1234);

        newConta.addMovimento(movimento1);
        newConta.addMovimento(movimento2);
        newConta.addMovimento(movimento3);
        newConta.addMovimento(new Movimento("presente", 30));

        System.out.println(newConta.movimentos);

        Scanner scanner = new Scanner(System.in);

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("ficheiros/movimentos.txt", false));
            for (int i = 0; i < newConta.movimentos.size(); i++) {
                printWriter.println(newConta.movimentos.get(i));
            }
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ContaBancaria conta2 = new ContaBancaria("ficheiros/contas.txt");
        System.out.println(conta2.getNome());
        System.out.println(conta2.getNumero());
    }
}
