package Aula12.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contacto> contactos = new ArrayList<>();

        contactos.add(new Contacto("José Silva", 123456L, "jose.silva@email.com"));
        contactos.add(new Contacto("Pedro Fernandes", 234567L, "pedro.fernandes@email.com"));
        contactos.add(new Contacto("Maria Sousa", 345678L, "maria.sousa@email.com"));
        contactos.add(new Contacto("Ana Lucia", 345678L, "maria.sousa@email.com"));

       for (Contacto contacto: contactos) {
           System.out.println(contacto.getNome() + " " + contacto.getNumeroTelefone() + " " + contacto.getEmail());
       }

       contactos.remove(0);
        System.out.println(contactos);


    }
}
