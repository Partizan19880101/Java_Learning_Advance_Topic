package javaAdvance.collection.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "Pavel");
        hashMap.put(2, "Yanina");
        hashMap.put(1, "Ivan");
        hashMap.put(7, "Sveta");
        hashMap.putIfAbsent(9, "Sveta"); //put if we do not have this element

        for (String s : hashMap.values()){
            System.out.println(s);
        }
        hashMap.remove(1);
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("Pavel"));
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsKey(9));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }

}
