package net.comments.sample;

public class LectionRoom implements Room {

    public void accept(Person someperson) {
        System.out.println(someperson.name() + " went into the room");
    }

}
