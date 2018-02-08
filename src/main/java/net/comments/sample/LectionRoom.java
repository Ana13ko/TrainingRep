package net.comments.sample;

public class LectionRoom implements Room {

    public void accept(Person somePerson) {
        System.out.println(somePerson.name() + " went into the room");
    }

}
