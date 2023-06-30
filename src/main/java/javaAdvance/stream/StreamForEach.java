package javaAdvance.stream;

import java.util.Arrays;

public class StreamForEach {

    public static void main(String[] args) {
        int [] arr = {1, 3, 4, -6, 9};
//        Arrays.stream(arr).forEach(el ->
//        {el *= 2;
//            System.out.println(el);
//        });
        Arrays.stream(arr).forEach(el -> System.out.println(el));
        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr).forEach(Utils::myMethod);


        for (int b : arr) {
            System.out.println(b);
        }
    }
}
class Utils {

    public static void myMethod(int a) {
        a += 5;
        System.out.println(a);
    }
}