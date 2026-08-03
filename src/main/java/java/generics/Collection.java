package uff.ic.lleme.ed.aulas.java.generics;

import uff.ic.lleme.ed.aulas.java.inheritance.Person;

public interface Collection<E extends Person> {

    public void add(E element);

    public E get(int index);

    public void remove(int index);
}
