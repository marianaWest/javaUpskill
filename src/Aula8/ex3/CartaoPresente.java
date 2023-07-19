package Aula8.ex3;

public abstract class CartaoPresente {
    private String destinatario;

    public CartaoPresente(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract void showMessage();
}
