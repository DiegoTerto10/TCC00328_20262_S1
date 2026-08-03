package uff.ic.lleme.ed.aulas.java.files;

import java.io.Serializable;

public class User implements Serializable {

    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{id:%x, name=\"%s\"}", id, name);
    }

}
