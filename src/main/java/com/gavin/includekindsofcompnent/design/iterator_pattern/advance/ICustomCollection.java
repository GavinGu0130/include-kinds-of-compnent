package com.gavin.includekindsofcompnent.design.iterator_pattern.advance;

public interface ICustomCollection<E> {
    void add(E e);
    int size();

    ICustomIterator getIterator();
}
