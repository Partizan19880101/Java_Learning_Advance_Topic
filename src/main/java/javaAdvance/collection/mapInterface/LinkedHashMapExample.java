package javaAdvance.collection.mapInterface;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Pavel", "Zuyonak", 2);
        Student st2 = new Student("Sveta", "Kisilaevich", 3);
        Student st3 = new Student("Valik", "Dudov", 5);
        Student st4 = new Student("Oleg", "Vorobey", 4);

        lhm.put(8.2, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(5.8, st4);
        for (Student m : lhm.values())
            System.out.println(m);

        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st5 = new Student("Pavel", "Zuyonak", 2);
        Student st6 = new Student("Sveta", "Kisilaevich", 3);
        ht.put(8.2, st5);
        ht.put(6.4, st6);
        System.out.println(ht);
    }
}