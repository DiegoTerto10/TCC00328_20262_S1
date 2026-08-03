package uff.ic.lleme.ed.aulas.java.generics;

import uff.ic.lleme.ed.aulas.java.inheritance.User;

public class Main {

    public static void main(String[] args) {
        Collection<User> coll = new CollectionImpl<>();

        User u1 = new User(1, "Luiz");
        User u2 = new User(2, "André");
        coll.add(u1);
        coll.add(u2);

        coll.get(1).println();
    }
}
