package Aula8.ex3;

public class Aniversario extends CartaoPresente {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println(getDestinatario() + "! Parabéns!");
    }
}
