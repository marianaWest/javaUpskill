package Aula11.ex4;

import java.util.Comparator;

public class AlfabeticaCompare implements Comparator<Livro> {

    public int compare(Livro livro1, Livro livro2) {
        return livro1.getTitulo().compareTo(livro2.getTitulo());
    }

    }

