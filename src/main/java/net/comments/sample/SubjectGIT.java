package net.comments.sample;

public class SubjectGIT implements Subject {

    public void learnedBy(Student student) {
        System.out.println(student.name() + " is studying git");
    }

    public void teachedBy(Teacher teacher) {
        System.out.println("Good day everyone!");
        System.out.println("My name is " + teacher.name() + ", I'll be your GIT teacher." );
        System.out.println("Please register in the attendance list by putting a signature next to your name.");
        System.out.println("Let's start!");
        System.out.println("So, who has ever worked with GIT?");
        System.out.println("...bla bla bla...");
        System.out.println(" "); // empty line, so ER is readable.
    }
}
