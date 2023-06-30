package javaAdvance.collection.mapInterface;

import io.cucumber.java.an.Dada;
import io.cucumber.java.it.Ma;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class HashCodeExample1 {

    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Pavel", "Zuyonak", 2);
        Student st2 = new Student("Sveta", "Kisilaevich", 3);
        Student st3 = new Student("Valik", "Dudov", 5);
        map.put(st1, 7.5);
        map.put(st2, 6.4);
        map.put(st3, 8.2);
        System.out.println(map);
        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());

        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());


//        System.out.println(map);
//        Student st4 = new Student("Pavel", "Zuyonak", 2);
//        Student st5 = new Student("Pdfdsfavel", "rZuyonak", 6);
//        map.put(st4, 6.4);
//        boolean result = map.containsKey(st4);
//        System.out.println("result = " + result);
//        System.out.println(map);
//        System.out.println(st1.equals(st4));
//        for (Map.Entry<Student, Double> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        Map<Integer, String> map1 = new HashMap<>(16, 0.75f);
    }
}
@AllArgsConstructor
@Data
@ToString


final class Student implements Comparable<Student>{
    final String name;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Student student = (Student) o;
//        return course == student.course && Objects.equals(name, student.name)
//            && Objects.equals(sureName, student.sureName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, sureName, course);
//    }

    final String sureName;
    final int course;


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

