package Aula6.ex4;

public class Student {
    private int studentNumber;
    private String studentName;
    private String studentCourse;

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", studentName='" + studentName + '\'' +
                ", studentCourse='" + studentCourse + '\'' +
                '}';
    }
}
