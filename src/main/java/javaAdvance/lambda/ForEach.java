package javaAdvance.lambda;

import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> list = List.of("Izmir", "Mersin", "Samsun", "Istambul", "Konya");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(str -> System.out.println(str));

        List<Integer> list1 = List.of(4, 5, 6, 7);
        list1.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });
    }
}
