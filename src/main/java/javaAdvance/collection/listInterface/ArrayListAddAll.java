package javaAdvance.collection.listInterface;


import java.util.ArrayList;
import org.asynchttpclient.util.Assertions;


public class ArrayListAddAll {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sveta");
        arrayList.add("Kisialevich");
        System.out.println(arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Pavel");
        arrayList2.add("Zuyonak");
        arrayList2.add("Zuyonak");

        arrayList.addAll(0, arrayList2);
        System.out.println(arrayList);
//        arrayList.clear();
        System.out.println(arrayList.indexOf("Zuyonak")); //return first index of element
        System.out.println(arrayList.lastIndexOf("Zuyonak"));//return last index of element
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Zuyonak"));

    }
}
