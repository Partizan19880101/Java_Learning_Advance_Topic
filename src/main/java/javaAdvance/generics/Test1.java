package javaAdvance.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List list = new ArrayList<>();
//        list.add("OK");
//        list.add(4);
//        list.add(new StringBuilder());
//        list.add(new Car());
        list.add("Hi");
        list.add("hello");
        list.add("Buy");
        for (Object pp : list) {
            System.out.println(pp + " lenght = " + ((String)pp).length());
        }

    }
}
class Car {}
