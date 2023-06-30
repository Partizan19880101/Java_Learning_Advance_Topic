package javaAdvance.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class FlatMapExample {

    public static void main(String[] args) {
        Dog dog = new Dog("Pavel", 23, 'm', 3, 6.8);
        Dog dog2 = new Dog("Lena", 18, 'f', 1, 8.8);
        Dog dog3 = new Dog("Oleg", 55, 'm', 5, 7.3);
        Dog dog4 = new Dog("Margarita", 34, 'f', 4, 7.1);
        List<Dog> dogF = Arrays.asList(dog, dog2, dog3, dog4);

        Faculty geography = new Faculty("Geography");
        Faculty economics = new Faculty("Economics");

        geography.addDogToFaculty(dog);
        geography.addDogToFaculty(dog2);

        economics.addDogToFaculty(dog3);
        economics.addDogToFaculty(dog4);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(geography);
        facultyList.add(economics);

        facultyList.stream().flatMap(faculty -> faculty.getDogsOnFaculty().stream())
            .forEach(e -> System.out.println(e.getName()));
    }
}
@Getter
@ToString
class Faculty {
    String name;
    List<Dog> dogsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        dogsOnFaculty = new ArrayList<>();
    }
    public void addDogToFaculty(Dog dog) {
        dogsOnFaculty.add(dog);
    }
}