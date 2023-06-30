package javaAdvance.collection.listInterface;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods3 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] arrays = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(arrays);
        System.out.println(list);
//        arrays[0].append("!!!");
        arrays[0] = new StringBuilder("E");
        System.out.println(list);
    }
}
