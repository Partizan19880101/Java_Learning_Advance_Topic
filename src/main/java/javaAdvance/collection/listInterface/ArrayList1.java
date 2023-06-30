package javaAdvance.collection.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Pavel");
        arrayList.add("Zuyonak");
        System.out.println(arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(3);
        arrayList2.add(4);
        System.out.println(arrayList2);

        ArrayList<Double> arrayList3 = new ArrayList<>(30);
        List<String> list = new ArrayList<String>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList);
        arrayList4.add("Partizan");
        System.out.println(arrayList4);
    }
}
