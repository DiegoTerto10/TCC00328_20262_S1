package uff.ic.lleme.ed.aulas.java.objects;

public class Main {

    public static void main(String[] args) {
        // Object (instance) creation with default constructor
        User u1 = new User();
        u1.id = 1;
        u1.name = "Luiz";
        u1.area = "RJ";

        // Object (instance) creation with specific constructor
        User u2 = new User(2, "André");

        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }
}
