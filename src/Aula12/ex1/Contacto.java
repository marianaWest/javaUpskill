package Aula12.ex1;

public class Contacto {
    private String nome;
    private long numeroTelefone;
    private String email;

    public Contacto(String nome, long numeroTelefone, String email) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto {" +
                "nome ='" + nome + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                ", email='" + email + '\'' +
                '}';
    }
}
