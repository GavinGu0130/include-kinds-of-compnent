package com.gavin.includekindsofcompnent.design.iterator_pattern.base;

public class IteratorEntry {
    public static void main(String[] args) {
        ICustomCollection list = new CustomArrayList();
        for (int i=0; i<16; i++){
            list.add("g" + i);
        }

        System.out.println("size = " + list.size());

        ICustomIterator iterator = list.getIterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}


