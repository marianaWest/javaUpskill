package MiniTeste;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor("ana", 123, 1);
        Employee employee = new Supervisor("maria", 345, 2);
        Employee another = new Employee("ze", 34);

        System.out.println(supervisor.toString());
        System.out.println(employee.toString());
        System.out.println(another.toString());
    }
}
