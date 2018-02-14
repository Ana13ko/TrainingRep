package net.comments.sample;

public class SubjectBaking implements Subject {

    public void learnedBy(Student student) {
        System.out.println(student.name() + " is learning how to bake");
    }

    public void teachedBy(Teacher teacher) {
        System.out.println("Hello students! Today we're going to bake a cake.");
        System.out.println("So... less theory, more practice. Turn on an oven and put the ingredients that you need on the table.");
        System.out.println("The list of the ingredients is on the board.");
        System.out.println("Completely forgot to introduce myself. I'm " + teacher.name() + "...");
        System.out.println(" "); // empty line, so ER is readable.
    }
}
