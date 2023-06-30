package javaAdvance.collection.setinterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Pavel");
        set.add("Yulia");
        set.add("Nikolay");
        set.add("Pavel");
        set.remove("Yulia");

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Nikolay"));

        for (String s : set) {
            System.out.println(s);
        }
    }

}
