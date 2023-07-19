package Aula13.ex2;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("exercicio3.txt", true));
            System.out.println("Qual seu nome?");
            String nome = scanner.nextLine();
            Integer idade = null;
            System.out.println("Qual sua idade?");
            while(idade == null) {
                try {
                    idade = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("idade invalida. Tente novamente.");
                } scanner.nextLine();
            }
            printWriter.println("nome: " + nome + ", idade: " + idade);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO exception");
        }

        File exercicio3 = new File("exercicio3.txt");
        try {
            Scanner scannerFicheiro = new Scanner(exercicio3);
            while (scannerFicheiro.hasNextLine()) {
                System.out.println(scannerFicheiro.nextLine());
            }
            scannerFicheiro.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ficheiro nao encontrado");
        }

    }
}
