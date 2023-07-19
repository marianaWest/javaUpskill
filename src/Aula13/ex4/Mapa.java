package Aula13.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mapa {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("mapa.txt"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] colunas = line.split("");
                String novaLinha = "";
                for(String coluna : colunas) {
                    if(coluna.equals("#")) {
                        novaLinha += "W";
                    } else {
                        novaLinha += " ";
                    }
                }
                System.out.println(novaLinha);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
