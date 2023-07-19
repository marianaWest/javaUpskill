package Aula13.ex1;

import Aula12.ex1.Contacto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Pessoa newPerson = null;
        List<Pessoa> pessoas = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("pessoas.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] vetor = line.split(";");
                String nome = vetor[0];
                int idade = Integer.parseInt(vetor[1]);
                String cidade = vetor[2];
                Pessoa pessoa = new Pessoa(nome, idade, cidade);
                pessoas.add(pessoa);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ficheiro nao encontrado");
        }
        for(Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
        }

    }
}
