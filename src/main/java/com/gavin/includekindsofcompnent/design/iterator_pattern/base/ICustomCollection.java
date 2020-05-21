package com.gavin.includekindsofcompnent.design.iterator_pattern.base;

public interface ICustomCollection {
    void add(Object e);
    int size();

    ICustomIterator getIterator();
}
