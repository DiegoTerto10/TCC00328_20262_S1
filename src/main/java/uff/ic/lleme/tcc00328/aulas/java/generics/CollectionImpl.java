package uff.ic.lleme.tcc00328.aulas.java.generics;

import uff.ic.lleme.tcc00328.aulas.java.inheritance.Person;

public class CollectionImpl<E extends Person> implements Collection<E> {

    private Object[] conteudo = new Object[100];

    @Override
    public void add(E element) {
        for (int i = 0; i < conteudo.length; i++)
            if (conteudo[i] == null) {
                conteudo[i] = element;
                return;
            }
        throw new IndexOutOfBoundsException("No available space.");
    }

    @Override
    public E get(int index) {
        return (E) conteudo[index];
    }

    @Override
    public void remove(int index) {
        conteudo[index] = null;
    }

}
