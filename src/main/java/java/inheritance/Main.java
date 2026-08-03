package uff.ic.lleme.ed.aulas.java.inheritance;

public class Main {

    public static void main(String[] args) {
        Printable u1 = new User(1, "Luiz");
        User u2 = new User(2, "André");
        Person p2 = u2;

        u1.println();
        u2.println();

        User u3 = (User) p2;
    }
}
