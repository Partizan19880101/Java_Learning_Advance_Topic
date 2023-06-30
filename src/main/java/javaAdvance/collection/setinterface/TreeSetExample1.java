package javaAdvance.collection.setinterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(9);
        set.add(1);
        set.add(-7);
//        set.add(null); //Can not add null
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println();
    }
}
