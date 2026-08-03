package uff.ic.lleme.tcc00328.aulas.java.inheritance;

public class User extends Person implements Printable {

    public int id;
    public static int att;

    public User(int id, String name) {
        super(name);
        this.id = id;
        User.att = 2;
    }

    @Override
    public String toString() {
        return String.format("{id:%x, name=%s}", id, name);
    }

    @Override
    public void println() {
        System.out.println(toString());
    }

}
