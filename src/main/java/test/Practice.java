package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String []args){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 41));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("    ", "Stevenson", 19));
        personList.add(new Person("  ", "Stevenson", 19));
        personList.add(new Person("Arnold", "Stevenson", 19));
        personList.add(new Person("Arnold", "Stew", 12));
        personList.add(new Person(null, "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));


        List result = personList.stream()
            .filter(person -> person != null && person.name != null && person.name.trim().length() > 0)
            .map(person -> person.name.toUpperCase())
            .distinct()
            .sorted()
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
//["PETER","PAUL","STEVE", "AARON", "ARNOLD"]
class Person {

    public Person(String name, String lastName, Integer age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    String name;
    String lastName;
    int age;
}