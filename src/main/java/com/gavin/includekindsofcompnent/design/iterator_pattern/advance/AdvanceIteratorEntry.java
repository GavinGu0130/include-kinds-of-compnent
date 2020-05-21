package com.gavin.includekindsofcompnent.design.iterator_pattern.advance;

public class AdvanceIteratorEntry {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            func();
            Thread.sleep(3000);
        }
    }

    public static void func(){
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


