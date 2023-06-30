package javaAdvance.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javaAdvance.generics.game.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class StreamFilter {

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

        System.out.println("?????????");
        //Chaning
//        list.stream().map(e -> {
//            e.setName(e.getName().toUpperCase());
//            return e;
//        })
//            .filter(e -> e.getSex() == 'm')
//            .sorted((x, y)->x.name.compareTo(y.name))
//            .forEach(e -> System.out.println(e));
//        System.out.println("sssssss");
        Dog first = list.stream().map(e -> {
                e.setName(e.getName().toUpperCase());
                return e;
            })
            .filter(e -> e.getSex() == 'm')
            .sorted((x, y)->x.name.compareTo(y.name))
            .findFirst().get();
        System.out.println(first);
        System.out.println("sssssss");


        list = list.stream().sorted((x, y) ->
            x.getName().compareTo(y.getName())
            ).collect(Collectors.toList());
        System.out.println(list);

        List<Dog> list2 = list.stream().filter(element -> element.age > 19 && element.grade < 8).collect(
            Collectors.toList());
        System.out.println(list2);
//        for (Dog s : list) {
//            System.out.println(s);
//        }
        Stream<Dog> myStream = Stream.of(dog, dog2, dog3, dog4);
        myStream.filter(element -> element.age > 19 && element.grade < 8).collect(
            Collectors.toList());
    }

}
@AllArgsConstructor
@Data
@ToString
class Dog {
    String name;
    int age;
    char sex;
    int course;
    double grade;
}