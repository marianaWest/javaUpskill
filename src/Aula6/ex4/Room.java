package Aula6.ex4;

public class Room {
    private int roomCapacidade;
    private String roomBloco;
    private int roomNumber;
    private Student[] students;

    public Room(int roomCapacidade, String roomBloco, int roomNumber) {
        this.roomCapacidade = roomCapacidade;
        this.roomBloco = roomBloco;
        this.roomNumber = roomNumber;
        this.students = new Student[roomCapacidade];
    }

   public int getRoomCapacidade() {
        return roomCapacidade;
   }
 public void addStudent(Student student) {
     for (int i = 0; i < roomCapacidade; i++) {
         if(students[i] == null) {
             students[i] = student;
             break;
         }
     }
 }
public void removeStudent(int number) {
    for (int i = 0; i < students.length; i++) {
        if(students[i] != null) {
            if(students[i].getStudentNumber() == number) {
                students[i] = null;
            }
        }
    }

}


 public void listStudents() {
     for (int i = 0; i < students.length; i++) {
         System.out.println(students[i]);
     }
 }
}
