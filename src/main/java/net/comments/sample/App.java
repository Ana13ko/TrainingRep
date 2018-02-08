package net.comments.sample;

public class App {
    public static void main(String[] args) {
        Student andrey = new AttentiveStudent("Andrey");
        Student nastya = new AttentiveStudent("Nastya");
        Student dima = new BadStudent("Dima");
        Teacher vasya = new TeacherOfMathematics("Vasyl");
        Room a = new LectionRoom();
        
        enter(a, andrey);
        enter(a, nastya);
        enter(a, dima);
        enter(a, vasya);

        begin(vasya);

        go(andrey);
        go(nastya);
        go(dima);
    }

    private static void enter(Room a, Person somePerson) {
        a.accept(somePerson);
    }

    private static void go(Student someone) {
        System.out.println(String.format("There is %s in the room!", someone.name()));
        someone.learn();
    }

    private static void begin(Teacher vasya) {
        System.out.println(String.format("The class starts!"));
        vasya.teach();
    }
}