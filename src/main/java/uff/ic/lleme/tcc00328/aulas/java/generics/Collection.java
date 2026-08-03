package uff.ic.lleme.tcc00328.aulas.java.generics;

import uff.ic.lleme.tcc00328.aulas.java.inheritance.Person;

public interface Collection<E extends Person> {

    public void add(E element);

    public E get(int index);

    public void remove(int index);
}
