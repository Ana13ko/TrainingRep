package net.comments.sample;

public class App {
    public static void main(String[] args) {
        Student andrey = new AttentiveStudent("Andrey");
        Student nastya = new AttentiveStudent("Nastya");
        Student dima = new BadStudent("Dima");
        go(andrey);
        go(nastya);
        go(dima);

        Teacher vasya = new TeacherOfMathematics("Vasyl");
        begin(vasya);


        /*enter(andrey);
        enter(nastya);
        enter(vasya);*/
    }

    private static void go(Student someone) {
        System.out.println(String.format("There is %s in the room!", someone.name()));
        someone.learn();
    }

    private static void begin(Teacher vasya) {
        System.out.println(String.format("The class starts!"));
        vasya.teach();
    }


    /*private static void enter(Room a,Person p) {
        String x = p.name();
        /*String y = a.accept();*/


}
