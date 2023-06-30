package javaAdvance.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {
        Stream<Integer> list1 = Stream.of(5, 5, 7, 9, 10, 7, 9, 10);
        Stream<Integer> list2 = Stream.of(8, 8, 7, 9, 10);
        Stream<Integer> list3 = Stream.of(0, 0, 0, 0, 10);


//        Stream<Integer> list5 = Stream.concat(list2, list3);
//        list5.forEach(e -> System.out.println(e));

//        list1.distinct().forEach(e -> System.out.println(e));
        System.out.println(list1.distinct().peek(System.out::println).count());
    }

}
