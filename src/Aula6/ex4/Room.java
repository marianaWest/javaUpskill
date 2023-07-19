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


}
