package javaAdvance.collection.mapInterface;

import java.util.Map;
import java.util.TreeMap;
import jdk.swing.interop.SwingInterOpUtils;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Pavel", "Zuyonak", 2);
        Student st2 = new Student("Sveta", "Kisilaevich", 3);
        Student st3 = new Student("Valik", "Dudov", 5);
        Student st4 = new Student("Oleg", "Vorobey", 4);
        Student st5 = new Student("Innokenty", "Kisilaevich", 5);
        Student st6 = new Student("Vlada", "Boleslavovna", 1);
        Student st7 = new Student("1Vlada", "Boleslavovna", 1);
        treeMap.put(8.2, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(5.8, st4);
        treeMap.put(4.9, st5);
        treeMap.put(8.9, st6);
        treeMap.put(8.9, st7);
        System.out.println(treeMap);
        System.out.println(treeMap.get(6.4));
        System.out.println(treeMap.remove(6.4));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(7.3));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
    }
}