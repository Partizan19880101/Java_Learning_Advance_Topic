package javaAdvance.collection.listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pavel");
        arrayList.add("Zuyonak");
        arrayList.add("Vasilisa");
        arrayList.add("Glasha");
        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);
    }
}
