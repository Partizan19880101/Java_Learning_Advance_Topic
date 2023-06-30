package javaAdvance.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamSorted {

    public static void main(String[] args) {

        int [] arr = {3, 4, 7, 9, 0};
//        int [] arr2 =  Arrays.stream(arr).sorted().toArray();
//        for (int a : arr2){
//            System.out.println(a);
//        }
//        System.out.println(Arrays.toString(arr2));
        int result = Arrays.stream(arr)
            .filter(e -> e%2 == 1)
            .map(e -> {
                if (e%3 == 0) {
                    e = e / 3;
                } return e;
            })
            .reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);
    }

}
