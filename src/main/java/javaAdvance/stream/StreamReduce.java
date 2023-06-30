package javaAdvance.stream;

import io.cucumber.java.sl.In;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 5, 7, 9, 10));
        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result2);


        List<String> list3 = new ArrayList<>(Arrays.asList("5", "ad", "ty", "y"));
        String result3 = list3.stream().reduce((concat, element) -> concat + " "+ element).get();
        System.out.println(result3);


        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> optionalInteger =
            list.stream().reduce((accumulator, element) -> accumulator * element);

        if (optionalInteger.isPresent()) {
            System.out.println(optionalInteger.get());
        } else {
            System.out.println("No elements");
        }
    }
}
