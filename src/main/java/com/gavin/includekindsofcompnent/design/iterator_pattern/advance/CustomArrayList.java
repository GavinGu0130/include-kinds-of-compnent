package com.gavin.includekindsofcompnent.design.iterator_pattern.advance;

public class CustomArrayList<T> implements ICustomCollection<T> {
    T[] objs = (T[])new Object[10];
    private int index = 0;


    @Override
    public void add(T o) {
        if (index == objs.length){
            T[] newObjs = (T[])new Object[objs.length * 2];
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
        return new ArrayListIterator<T>();
    }

    private class ArrayListIterator<T> implements ICustomIterator<T> {
        private  int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= index)
                return false;

            return  true;
        }

        @Override
        public T next() {
            T o = (T) objs[currentIndex];
            currentIndex ++;
            return  o;
        }
    }
}
