package net.comments.sample;

public class App {
    public static void main(String[] args) {
        Student andrey = new AttentiveStudent("Andrey");
        Student kirill = new AttentiveStudent("Kirill");

        Student tolya = new BadStudent("Tolik");
        Student dima = new BadStudent("Dima");


        String[] list = new String[]{"Andrey", "Nastya", "Lesya", "Ira", "Klavdiia", "Anton", "Kirill", "Tolik", "Dima"};

        Teacher vasya = new TeacherAll("Vasyl");
        Teacher petr = new TeacherAll("Petrovich");

        Room big = new RoomBig();
        Room small = new RoomSmall();

        Subject git = new SubjectGIT();
        Subject bake = new SubjectBaking();

        go1(list, small);
        go1(vasya, small);
        go1(vasya, git);
        go1(andrey, git);

        go3(tolya, git);
        go3(dima, git);

        go2(list, big);
        go2(petr, big);
        go2(petr, bake);
        go2(kirill, bake);
    }

    public static void go1(String[] list, Room small) {
        small.accept(list);
    }

    public static void go1(Teacher vasya, Room small) {
        small.accept(vasya);
    }

    public static void go1(Teacher vasya, Subject git) {
        git.teachedBy(vasya);
    }

    public static void go1(Student andrey, Subject git) {
        git.learnedBy(andrey);
    }

    public static void go3(Student student, Subject git) {
        student.learn(git);
    }

    public static void go2(String[] list, Room big) {
        big.accept(list);
    }

    public static void go2(Teacher petr, Room big) {
        big.accept(petr);
    }

    public static void go2(Teacher petr, Subject bake) {
        bake.teachedBy(petr);
    }

    public static void go2(Student kirill, Subject bake) {
        bake.learnedBy(kirill);
    }
}



/*
        Student nastya = new AttentiveStudent("Nastya");
        Student lesya = new AttentiveStudent("Lesya");
        Student ira = new AttentiveStudent("Ira");
        Student klava = new AttentiveStudent("Klavdiia");
        Student anton = new AttentiveStudent("Anton");
 */