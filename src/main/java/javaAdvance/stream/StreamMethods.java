package javaAdvance.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Pavel", "Iven", "Goshanchik"));
        List<Integer> list1 = list.stream().map(element -> element.length()).collect(Collectors.toList());

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        System.out.println(list1);

        int[] arr = {1, 5, 9, 44, 68};
        arr = Arrays.stream(arr).map(
            element -> {
                if (element%3 == 0) {
                    element = element / 3;
                } return element;
                }).toArray();
        System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>(Arrays.asList("Pavel", "Inga", "Vladislav", "Nicolay"));
        System.out.println(set);
        Set<Integer> set1 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set1);
    }
}
