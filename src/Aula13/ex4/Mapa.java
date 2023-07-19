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
               for (int i = 0; i < colunas.length; i++) {
                    if(colunas[i].equals("#") ) {
                        colunas[i] = "W";
                    } else {
                        colunas[i] = " ";
                    }
                }
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(vetor[i]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
