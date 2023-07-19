package Aula13.exemplo1;

import java.io.*;
import java.util.Scanner;

public class Ficheiros {
    public static void main(String[] args) {
        File ficheiro = new File("batatas.txt");

        try {
            Scanner scanner = new Scanner(ficheiro);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ficheiro nao encontrado");
        }

        // print writer
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("ficheiro.txt", true));
            printWriter.println("hello world");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO exception");
        }

        File ficheiro1 = new File("ficheiro.txt");
        try {
            Scanner scanner = new Scanner(ficheiro1);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ficheiro nao encontrado");
        }
    }
}
