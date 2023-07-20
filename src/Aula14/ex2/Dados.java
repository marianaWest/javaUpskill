package Aula14.ex2;

import java.io.Serializable;

public class Dados implements Serializable {
    private String nome;
    private String nota;
    private String titulo;

    public Dados(String nome, String nota, String titulo) {
        this.nome = nome;
        this.nota = nota;
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
