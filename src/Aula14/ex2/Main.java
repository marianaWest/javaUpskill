package Aula14.ex2;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha 1 para salvar dados ou 2 para carregar dados");
        int resposta = scanner.nextInt();

        String nome = "";
        String nota = "";
        String titulo = "";
        String nomeFicheiro = "";
        String ficheiroCarregar = "";

        if (resposta == 1) {
            scanner.nextLine();
            System.out.println("Diga seu nome.");
            nome = scanner.nextLine();
            System.out.println("Entre uma nota.");
            nota = scanner.nextLine();
            System.out.println("Entre um titulo.");
            titulo = scanner.nextLine();
            System.out.println("Qual o nome do ficheiro?");
            nomeFicheiro = scanner.nextLine()+".dat";

            Dados dados = new Dados(nome, nota, titulo);

            try {
                FileOutputStream fileOut = new FileOutputStream(nomeFicheiro);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(dados);
                out.close();
                fileOut.close();
            } catch (IOException e) {
                System.out.println("Erro a salvar o mapa no ficheiro!");
            }
        }
         else if (resposta == 2) {
            scanner.nextLine();

            System.out.println("carregar dados");
            System.out.println("qual o nome do ficheiro a carregar?");
            ficheiroCarregar = scanner.nextLine()+".dat";

            try {
               FileInputStream fileIn = new FileInputStream(ficheiroCarregar);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                Dados dados = (Dados) in.readObject();
                in.close();
                fileIn.close();
                System.out.println("nome: " + dados.getNome() + ", nota:" + dados.getNota() + ", titulo: " + dados.getTitulo());
            } catch (IOException e) {
                System.out.println("Erro a ler o ficheiro!");
            } catch (ClassNotFoundException e) {
                System.out.println("Não foi possível converter o objeto!");
            }
        } else {
            System.out.println("erro. escolha 1 ou 2.");
        }
    }


}
