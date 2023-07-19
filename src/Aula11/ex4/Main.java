package Aula11.ex4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Livro[] livros = new Livro[5];

        livros[0] = new Livro("The Shining", "Leya", 1990, "Stephen King");
        livros[1] = new Livro("Harry Potter", "ASA", 2001, "J.K. Rowling");
        livros[2] = new Livro("Dante", "Bertrand", 1472, "Dante");
        livros[3] = new Livro("O Conde de Monte Cristo", "Texto", 1844, "Alexandre Dumas");
        livros[4] = new Livro("Desenhar Bases de Dados", "Silabo", 2016, "Pedro Nogueira");

        AlfabeticaCompare compare = new AlfabeticaCompare();

        Arrays.sort(livros, compare);
        System.out.println("ordenado por titulo");

        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i].getTitulo());
        }

        AnoCompare compareAno = new AnoCompare();
        Arrays.sort(livros, compareAno);
        System.out.println("ordenado por ano decrescente");
        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i].getTitulo() + " " + livros[i].getAno());
        }

        EditoraCompare compareEditora = new EditoraCompare();
        Arrays.sort(livros, compareEditora);
        System.out.println("ordenado por editora");
        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i].getTitulo() + " " + livros[i].getEditora());
        }

    }
}
