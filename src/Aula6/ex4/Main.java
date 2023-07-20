package Aula6.ex4;

public class Main {
    public static void main(String[] args) {
        Room sala1 = new Room(3, "A", 32);

        Student ana = new Student(12, "ana");
        Student maria = new Student(23, "maria");
        Student mariana = new Student(34, "mariana");
         Student anamaria = new Student(45, "anamaria");

        sala1.addStudent(ana);
        sala1.addStudent(maria);
        sala1.addStudent(mariana);

        sala1.listStudents();
        sala1.addStudent(anamaria);

        sala1.removeStudent(12);
        System.out.println("sem estudante");
        sala1.listStudents();

    }
}
