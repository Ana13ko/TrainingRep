package net.comments.sample;

public class AttentiveStudent implements Student { //AttentiveStudent class > реализовует все методы Интерфейса Person
    private final String name;

    public AttentiveStudent(String name) {
        this.name = name;
    }

    public void learn(Subject subject) {
        subject.learnedBy(this);
    }

    public String name() {
        return this.name;
    }
}
