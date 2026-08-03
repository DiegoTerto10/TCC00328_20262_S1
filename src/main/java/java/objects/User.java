package uff.ic.lleme.ed.aulas.java.objects;

// Java Class
public class User {

    // properties
    public int id;
    public String name;
    public static String area;

    // default constructor
    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method
    @Override
    public String toString() {
        return String.format("{id:%x, name=%s}", id, name);
    }

}
