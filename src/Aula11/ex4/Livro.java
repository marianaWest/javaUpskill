package Aula11.ex4;

public class Livro {
    private String titulo;
    private String editora;
    private int ano;
    private String autor;

    public Livro(String titulo, String editora, int ano, String autor) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
