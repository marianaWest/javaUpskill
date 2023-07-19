package Aula11.ex3;

public class Filme implements Comparable<Filme>{
    private int pontuacao;
    private String nome;
    private int ano;

    public Filme(int pontuacao, String nome, int ano) {
        this.pontuacao = pontuacao;
        this.nome = nome;
        this.ano = ano;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int compareTo(Filme filme) {
        if(ano == filme.ano)
            return 0;
        else if(ano > filme.ano)
            return 1;
        else
            return -1;
    }
}
