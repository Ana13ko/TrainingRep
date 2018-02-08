package net.comments.sample;

public class AttentiveStudent implements Student { //AttentiveStudent class > реализовует все методы Интерфейса Person
    private final String name;

    public AttentiveStudent(String name) {
        this.name = name;
    }

    public void learn() {
        System.out.println(this.name + " is listening...");
    }

    public String name() {
        return this.name;
    }
}
