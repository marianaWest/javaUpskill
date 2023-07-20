package MiniTeste;

public class Supervisor extends Employee {
    private int level;

    public Supervisor(String nome, int numero, int level) {
        super(nome, numero);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "level=" + level +
                '}';
    }
}
