package Aula11;

import java.util.Locale;
import java.util.Scanner;

public class ExemploEnum {
    public static void main(String[] args) {
        Direction dir = Direction.NORTH;
        if (dir == Direction.NORTH) {
            System.out.println(Direction.NORTH.name());
        }
        System.out.println(dir.prettyName());
        System.out.println(Direction.SOUTH.ordinal());

        for(Direction direction : Direction.values()) {
            System.out.println(direction);
        }

      DayOfWeek day = DayOfWeek.QUARTA;
        System.out.println(DayOfWeek.DOMINGO);
        System.out.println(DayOfWeek.DOMINGO.name());

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Introduza um comando:");
            String line = scanner.nextLine().toUpperCase();
            Comando comando = Comando.valueOf(line);
            switch (comando) {
                case SAVE:
                    System.out.println("jogo salvo");
            }
        }

    }
}
