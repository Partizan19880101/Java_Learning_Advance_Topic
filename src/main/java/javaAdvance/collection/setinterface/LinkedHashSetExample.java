package javaAdvance.collection.setinterface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet();
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(8);
        set.add(10);
        System.out.println(set);
    }
}
