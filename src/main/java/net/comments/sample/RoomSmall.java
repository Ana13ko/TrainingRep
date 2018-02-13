package net.comments.sample;

public class RoomSmall implements Room {

    public void accept(String[] students) {
        for (int i = 0; i < 6; i++) {
            System.out.println(students[i] + " enters the Room #2.");
        }
        for (int i = 6; i <= 6; i++) {
            System.out.println(" "); //empty line, so ER is readable.
            System.out.println("There are no seats available.");
            System.out.println("Students of baking class, please proceed to the Room #1.");
            System.out.println("Administration.");
            System.out.println(" "); //empty line, so ER is readable.
        }
    }

    public void accept(Teacher teacher) {
        System.out.print(teacher.name() + " enters the Room #2.");
    }
}
