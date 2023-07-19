package Aula11.ex4;

import java.util.Comparator;

public class EditoraCompare implements Comparator<Livro> {
    public int compare(Livro livro1, Livro livro2) {
        return livro1.getEditora().compareTo(livro2.getEditora());

    }
}
