package javaAdvance.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectStream {

    public static void main(String[] args) {
        Dog dog = new Dog("Pavel", 23, 'm', 3, 6.8);
        Dog dog2 = new Dog("Lena", 18, 'f', 1, 8.8);
        Dog dog3 = new Dog("Oleg", 55, 'm', 5, 7.3);
        Dog dog4 = new Dog("Margarita", 34, 'f', 4, 7.1);

        List<Dog> list = new ArrayList<>();
        list.add(dog);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);

//        Map<Integer, List<Dog>> map = list.stream().map(x -> {
//            x.setName(x.getName().toUpperCase());
//            return x;
//        }).collect(Collectors.groupingBy(el -> el.getCourse()));

//        for(Map.Entry<Integer, List<Dog>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
//        }
//
        Map<Boolean, List<Dog>> map =
            list.stream()
            .collect(Collectors.partitioningBy(el -> el.getGrade() > 7.0));

        for(Map.Entry<Boolean, List<Dog>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }
}
