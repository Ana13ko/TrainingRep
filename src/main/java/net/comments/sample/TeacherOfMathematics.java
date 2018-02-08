package net.comments.sample;

public class TeacherOfMathematics implements Teacher {
    private final String name;

    public TeacherOfMathematics(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println("Open the book on the page #25.");
    }

    public String name() {
        return this.name;
    }
}
