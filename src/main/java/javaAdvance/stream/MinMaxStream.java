package javaAdvance.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MinMaxStream {

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

        List<Integer> numberOfCourse = list.stream()
            .mapToInt(el -> el.getCourse())
            .boxed()
            .sorted()
            .collect(Collectors.toList());
        System.out.println(numberOfCourse);

        int sum = list.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        double average = list.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(average);

        int min = list.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = list.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max);

//            Dog minAgeDog = list.stream().min(Comparator.comparingInt(Dog::getAge)).get();
//            Dog maxAgeDog = list.stream().max(Comparator.comparingInt(Dog::getAge)).get();
//        System.out.println(maxAgeDog);
//        System.out.println(minAgeDog);
//        list.stream().filter(x -> x.getAge() > 20).forEach(System.out::println);
//        System.out.println("_____________________");
//        list.stream().filter(x -> x.getAge() > 20).limit(1).forEach(System.out::println);
//        System.out.println("_____________________");
//        list.stream().filter(x -> x.getAge() > 20).skip(1).forEach(System.out::println);


    }
}
