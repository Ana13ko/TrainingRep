package net.comments.sample;

public class TeacherAll implements Teacher {
    private final String name;

    public TeacherAll(String name) {
        this.name = name;
    }

    public void teach(Subject subject) {
        subject.teachedBy(this);
    }

    public String name() {
        return this.name;
    }
}
