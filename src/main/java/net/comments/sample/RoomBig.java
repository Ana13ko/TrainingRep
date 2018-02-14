package net.comments.sample;

public class RoomBig implements Room {

    public void accept(String[] students) {
        for (int i = 6; i < students.length; i++) {
            System.out.println(students[i] + " enters the Room #1");
        }
    }

    public void accept(Teacher teacher) {
        System.out.println(" ");  // empty line, so ER is more readable.
        System.out.println(teacher.name() + " enters the Room #1.");
    }
}
