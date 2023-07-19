package Aula6.ex2;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String street;
    private String nationality;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getStreet() {
        return street;
    }

    public String getNationality() {
        return nationality;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStreet(String morada) {
        this.street = street;
    }

    public void setNationality(String nacionalidade) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "O meu nome é " + firstName + " e tenho " + age + " anos.";
    }
}
