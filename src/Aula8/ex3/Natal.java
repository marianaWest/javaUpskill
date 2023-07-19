package Aula8.ex3;

public class Natal extends CartaoPresente {

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println(getDestinatario() + ", feliz Natal!");
    }
}
