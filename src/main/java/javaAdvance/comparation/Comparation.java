package javaAdvance.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparation {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pavel");
        list.add("Ragnar");
        list.add("Aoron");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
