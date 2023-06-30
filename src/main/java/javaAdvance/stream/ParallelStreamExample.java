package javaAdvance.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(Arrays.asList(10.0, 5.3, 4.3, 5.9, 9.9));

        double sumResult = list.stream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(sumResult);

        double sumResult2 = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(sumResult2);
    }
}
