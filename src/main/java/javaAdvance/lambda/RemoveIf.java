package javaAdvance.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "By"));
        list.add("Fenerbahche");
        list.add("Antalyaspor");
        list.add("Trabzonspor");
        list.add("Lazio");
        list.add("Beshiktash");
        list.remove("Hello");
//        list.removeIf(el -> el.length() > 5);
        Predicate<String> p = el -> el.length() > 5;
        list.removeIf(p);
        System.out.println(list);
    }
}
