package javaAdvance.generics;

import com.beust.ah.A;
import java.util.ArrayList;

public class ParametrizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        int a = GenericMethod.getSecondElement(arr);
        System.out.println(a);

//        ArrayList<String> arr2 = new ArrayList<>();
//        arr2.add("Pavel");
//        arr2.add("Zuyonak");
//        String b = GenericMethod.getSecondElement(arr2);
//        System.out.println(b);
    }
}

class GenericMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

