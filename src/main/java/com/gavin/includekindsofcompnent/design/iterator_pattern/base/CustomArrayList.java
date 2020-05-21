package com.gavin.includekindsofcompnent.design.iterator_pattern.base;

public class CustomArrayList<T> implements ICustomCollection {
    Object[] objs = new Object[10];
    private int index = 0;


    @Override
    public void add(Object o) {
        if (index == objs.length){
            Object[] newObjs = new Object[objs.length * 2];
            System.arraycopy(objs, 0, newObjs, 0, objs.length);
            objs = newObjs;
        }
        objs[index] = o;
        index ++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public ICustomIterator getIterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements ICustomIterator{
        private  int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= index)
                return false;

            return  true;
        }

        @Override
        public Object next() {
            Object o = objs[currentIndex];
            currentIndex ++;
            return  o;
        }
    }
}
