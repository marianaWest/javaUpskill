package Aula8.ex3;

public class DiaDosNamorados extends CartaoPresente {
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println(getDestinatario() + ", te amo");
    }
}
