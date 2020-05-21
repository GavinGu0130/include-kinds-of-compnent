package com.gavin.includekindsofcompnent.design.iterator_pattern;

public interface ICustomCollection {
    void add(Object e);
    int size();

    ICustomIterator getIterator();
}
