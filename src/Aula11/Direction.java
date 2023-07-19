package Aula11;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public String prettyName() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
