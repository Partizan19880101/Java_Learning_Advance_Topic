package javaAdvance.collection.setinterface;

import io.cucumber.java.sl.In;
import java.util.HashSet;
import java.util.Set;

public class HashSetExampleInteger {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(8);
//        for (Integer n : set) {
//            System.out.println(n);
//        }
        Set<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(3);
        set2.add(5);
        set2.add(8);

        Set<Integer> unionSet = new HashSet<>(set);
        unionSet.addAll(set2);
        Set<Integer> intersec = new HashSet<>(set);
        intersec.retainAll(set2);
        System.out.println(intersec);
        Set<Integer> subtract = new HashSet<>(set);
        subtract.retainAll(set2);
        System.out.println(subtract);
    }
}
